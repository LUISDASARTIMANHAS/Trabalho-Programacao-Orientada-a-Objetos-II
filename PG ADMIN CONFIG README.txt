local do pg hba config
C:\Program Files\PostgreSQL\17\data\pg_hba.conf

ARQUIVO DE CONFIGURAÇÃO
pg_hba.conf
COLOCAR SUBSTITUIR O DEFAULT POR ESSE
RECOMENDAVEL FAZER BACKUP

ALTERAÇÕES EFETUADAS EM 


# TYPE  DATABASE        USER            ADDRESS                 METHOD

# "local" is for Unix domain socket connections only
local   all             all                                     trust
# IPv4 local connections:
host    all             all             127.0.0.1/32            trust
# IPv6 local connections:
host    all             all             ::1/128                 trust

ALTERADO PARA TRUST PARA QUE O PG ADMIN ACEITE A CONEXÃO

USUARIO: 
TROTSSISTEMAS
PSW: 
SISTEMA
BANCO DE DADOS:
trotsSistemas


SAIDA PREVISTA DO NETBEANS

cd D:\Projetos Temporarios\Trabalho-Programacao-Orientada-a-Objetos-II\TrotsSistemas; "JAVA_HOME=C:\\Program Files\\Java\\jdk-24" cmd /c "\"C:\\Program Files\\NetBeans-25\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=control.GUIManager \"-Dexec.executable=C:\\Program Files\\Java\\jdk-24\\bin\\java.exe\" -Dexec.workingdir= \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-25\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/C:/Program%20Files/NetBeans-25/netbeans/java/maven/lib/jansi-2.4.1.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/C:/Program%20Files/NetBeans-25/netbeans/java/maven/lib/guava-33.2.1-jre.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for pingobras.glitch.me:TrotsSistemas:jar:1.0.0
[WARNING] 'dependencies.dependency.systemPath' for pingobras.glitch.me:LDAUtils:jar should not point at files within the project directory, ${project.basedir}/lib/LDAUtils-1.0.0-jar-with-dependencies.jar will be unresolvable by dependent projects @ line 49, column 25
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] -----------------< pingobras.glitch.me:TrotsSistemas >------------------
[INFO] Building TrotsSistemas 1.0.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec:3.1.0:exec (default-cli) @ TrotsSistemas ---
mai. 20, 2025 5:48:45 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.4.0.Final}
mai. 20, 2025 5:48:46 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
mai. 20, 2025 5:48:46 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
mai. 20, 2025 5:48:47 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
mai. 20, 2025 5:48:47 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [org.postgresql.Driver] at URL [jdbc:postgresql://localhost:5432/trotsSistemas]
mai. 20, 2025 5:48:47 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=TROTSSISTEMAS, password=****}
mai. 20, 2025 5:48:47 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
mai. 20, 2025 5:48:47 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 1 (min=1)
mai. 20, 2025 5:48:47 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
mai. 20, 2025 5:48:47 PM org.hibernate.type.BasicTypeRegistry register
INFO: HHH000270: Type registration [java.util.UUID] overrides previous : org.hibernate.type.UUIDBinaryType@26d10f2e
mai. 20, 2025 5:48:48 PM org.hibernate.mapping.RootClass checkCompositeIdentifier
WARN: HHH000038: Composite-id class does not override equals(): domain.ItemPedidoPK
mai. 20, 2025 5:48:48 PM org.hibernate.mapping.RootClass checkCompositeIdentifier
WARN: HHH000039: Composite-id class does not override hashCode(): domain.ItemPedidoPK
mai. 20, 2025 5:48:48 PM org.hibernate.tuple.PojoInstantiator <init>
INFO: HHH000182: No default (no-argument) constructor for class: domain.Venda (class must be instantiated by Interceptor)
mai. 20, 2025 5:48:49 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@52b3bf03] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: 
    
    create table Cidade (
       idCidade  serial not null,
        nome varchar(100) not null,
        primary key (idCidade)
    )
Hibernate: 
    
    create table Cliente (
       id  serial not null,
        cpf varchar(14) not null,
        email varchar(255) not null,
        foto oid,
        nome varchar(100) not null,
        tel varchar(15),
        idCidade int4,
        primary key (id)
    )
Hibernate: 
    
    create table Endereco (
       idEndereco int4 not null,
        bairro varchar(255),
        cep varchar(9) not null,
        cidade varchar(255),
        complemento varchar(255),
        logradouro varchar(255),
        numero int4 not null,
        referencia varchar(255),
        uf varchar(2) not null,
        primary key (idEndereco)
    )
Hibernate: 
    
    create table Erva (
       idErva  serial not null,
        nome varchar(100) not null,
        peso int4 not null,
        sabor varchar(255),
        valor float4 not null,
        primary key (idErva)
    )
Hibernate: 
    
    create table ItemPedido (
       Obs varchar(255),
        Qdte int4 not null,
        idErva int4 not null,
        idPedido int4 not null,
        primary key (idErva, idPedido)
    )
Hibernate: 
    
    create table Venda (
       idVenda int4 not null,
        data date,
        valorTotal float4 not null,
        idCliente int4,
        primary key (idVenda)
    )
Hibernate: 
    
    alter table Cliente 
       drop constraint UK_62uiuvr9jpnkok8sve9l23dvg
Hibernate: 
    
    alter table Cliente 
       add constraint UK_62uiuvr9jpnkok8sve9l23dvg unique (cpf)
Hibernate: 
    
    alter table Cliente 
       add constraint FKmy206o894nmu0dgmls6ipe1h0 
       foreign key (idCidade) 
       references Cidade
Hibernate: 
    
    alter table Endereco 
       add constraint FKckb1ka9v74bxqj12ss8ccxntr 
       foreign key (idEndereco) 
       references Cliente
Hibernate: 
    
    alter table ItemPedido 
       add constraint FK5822hbj65rnltjhlj6t6kdeda 
       foreign key (idErva) 
       references Erva
Hibernate: 
    
    alter table ItemPedido 
       add constraint FKdtf4w8b0wofrxjp5tq2rwrgsr 
       foreign key (idPedido) 
       references Venda
Hibernate: 
    
    alter table Venda 
       add constraint FKe6ddgr6y2tf57tjlu3ha284yt 
       foreign key (idCliente) 
       references Cliente
Changed Look And Feel to: Metal
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  23.044 s
[INFO] Finished at: 2025-05-20T17:49:06-03:00
[INFO] ------------------------------------------------------------------------