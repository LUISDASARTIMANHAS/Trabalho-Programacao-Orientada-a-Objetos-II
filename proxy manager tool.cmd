@echo off
:: Gerenciador de PortProxy Avançado
:: Executar como Administrador automaticamente

:: Verifica se está rodando como Admin
net session >nul 2>&1
if %errorlevel% neq 0 (
    echo [!] Este script precisa ser executado como administrador.
    echo Solicitando permissao...
    powershell -Command "Start-Process '%~f0' -Verb runAs"
    exit /b
)

set LOG="%USERPROFILE%\portproxy.log"

:menu
cls
color 0A
echo ===============================================
echo        GERENCIADOR DE ROTEAMENTO PORTPROXY
echo ===============================================
echo LOGS PATH: %LOG% 
echo.
echo 1 - Mostrar rotas ativas
echo 2 - Adicionar nova rota proxy
echo 3 - Remover rota
echo 4 - Ver log de operacoes
echo 5 - Ver conexoes ativas
echo 6 - Exportar tabela de rotas
echo 7 - Limpar rotas inativas
echo 0 - Sair
echo.
set /p opcao=Escolha uma opcao: 

if "%opcao%"=="1" goto mostrar
if "%opcao%"=="2" goto adicionar
if "%opcao%"=="3" goto remover
if "%opcao%"=="4" goto log
if "%opcao%"=="5" goto conexoes
if "%opcao%"=="6" goto exportar
if "%opcao%"=="7" goto limpar
if "%opcao%"=="0" exit

goto menu

:mostrar
cls
echo ============ ROTAS ATIVAS ============

:: Solicita ao usuário a porta a ser exibida
set /p porta_filtro=Digite a porta para exibir (deixe em branco para mostrar todas as rotas): 

:: Se o usuário não digitar nada, mostra todas as rotas
if "%porta_filtro%"=="" (
    netsh interface portproxy show all
) else (
    :: Caso contrário, filtra as rotas pela porta
    netsh interface portproxy show all | findstr "%porta_filtro%"
)

echo ========================================
pause
goto menu

:adicionar
cls
echo ==== ADICIONAR NOVA ROTA ====
set /p destino_ip=Digite o IP do PC de destino: 
set /p porta_local=Digite a porta de entrada (local): 
set /p porta_destino=Digite a porta de destino (remota): 

ping -n 1 %destino_ip% >nul
if %errorlevel% neq 0 (
    echo [ERRO] O IP de destino nao respondeu. Verifique a rede.
    pause
    goto menu
)

netsh interface portproxy add v4tov4 listenport=%porta_local% listenaddress=0.0.0.0 connectport=%porta_destino% connectaddress=%destino_ip% >nul 2>&1
if %errorlevel%==0 (
    echo [OK] Rota adicionada com sucesso.
    echo [%date% %time%] ADICIONADO: %porta_local% -> %destino_ip%:%porta_destino% >> %LOG%
) else (
    echo [ERRO] Falha ao adicionar a rota.
)
pause
goto menu

:remover
cls
echo ==== REMOVER ROTA ====
set /p porta_remover=Digite a porta local a ser removida: 
netsh interface portproxy delete v4tov4 listenport=%porta_remover% listenaddress=0.0.0.0 >nul 2>&1
if %errorlevel%==0 (
    echo [OK] Rota removida com sucesso.
    echo [%date% %time%] REMOVIDO: Porta local %porta_remover% >> %LOG%
) else (
    echo [ERRO] Falha ao remover a rota.
)
pause
goto menu

:log
cls
echo ====== LOG DE OPERACOES ======
type %LOG%
echo ===============================
pause
goto menu

:conexoes
cls
echo ======= MONITOR DE CONEXÕES (NETSTAT) =======
set /p porta_netstat=Digite a porta que deseja verificar (deixe em branco para ver todas): 

echo.
echo (Pressione qualquer tecla para voltar ao menu...)
echo.

REM Verifica se a variável porta_netstat tem valor
if "%porta_netstat%"=="" (
    netstat -ano | findstr LISTENING
    echo.
    netstat -ano | findstr ESTABLISHED
) else (
    netstat -ano | findstr ":%porta_netstat%"
)

pause
goto menu

:exportar
netsh interface portproxy show all > rotas_backup.txt
echo Backup salvo em rotas_backup.txt
pause
goto menu

:limpar
cls
echo Verificando rotas inativas...
(for /f "tokens=1,2,3,4" %%a in ('netsh interface portproxy show all ^| findstr /r "[0-9]"') do (
    ping -n 1 %%c >nul
    if errorlevel 1 (
        echo [%date% %time%] IP %%c inativo. Removendo...
        netsh interface portproxy delete v4tov4 listenport=%%b listenaddress=%%a >nul
        echo [%date% %time%] REMOVIDO AUTO: %%a:%%b -> %%c:%%d >> %LOG%
    )
))
echo.
echo Limpeza concluida.
pause
goto menu