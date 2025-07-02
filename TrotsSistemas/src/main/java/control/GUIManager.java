/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import domain.Cidade;
import domain.Cliente;
import domain.Endereco;
import domain.Erva;
import domain.Venda;
import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import org.hibernate.HibernateException;
import swing.*;
import viwer.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class GUIManager {

    private static final GUIManager myInstance = new GUIManager();
    private Principal principal = null;
    private DialogCadastro cadCli = null;
    private DialogBuscaCli buscaCli = null;
    private DialogBuscaProd buscaProd = null;
    private DialogBuscaVendas buscaVendas = null;
    private DialogCadastroProduto cadProd = null;
    private DialogCadastroVenda cadVenda = null;

    private DaoManager daoManager;
    private RelatorioManager relManager;

    // ########  SINGLETON  #########
    private GUIManager() {
        try {
            daoManager = new DaoManager();
            relManager = new RelatorioManager();
        } catch (java.lang.ExceptionInInitializerError | ClassNotFoundException | HibernateException ex) {
            LDASwingUtils.messageError(null, ex.toString(), "FATAL ERRO AO INICIAR");
            Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);

            System.exit(-1);
        }
    }

    public static GUIManager getMyInstance() {
        return myInstance;
    }

    public DaoManager getDaoManager() {
        return daoManager;
    }

    public RelatorioManager getRelManager() {
        return relManager;
    }

    // ######### SINGLETON ###########
    // ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
//                playSound(null);
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    public void abrirPrincipal() {
        principal = new Principal();
        LDASwingUtils.ChangeLookAndFeel(Principal.class.getName(), "Metal", principal);
        principal.setVisible(true);
    }

    public Cliente abrirBuscaCli() {
        buscaCli = (DialogBuscaCli) abrirJanela(principal, buscaCli, DialogBuscaCli.class);
        return buscaCli.getCliSelecionado();
    }

    public Erva abrirBuscaProd() {
        buscaProd = (DialogBuscaProd) abrirJanela(principal, buscaProd, DialogBuscaProd.class);
        return buscaProd.getErvaSelecionada();
    }

    public Venda abrirBuscaVenda() {
        buscaVendas = (DialogBuscaVendas) abrirJanela(principal, buscaVendas, DialogBuscaVendas.class);
        return buscaVendas.getVendaSelecionada();
    }

    public void abrirCadCli() {
        cadCli = (DialogCadastro) abrirJanela(principal, cadCli, DialogCadastro.class);
    }

    public void abrirCadProd() {
        cadProd = (DialogCadastroProduto) abrirJanela(principal, cadProd, DialogCadastroProduto.class);
    }

    public void abrirCadVenda() {
        cadVenda = (DialogCadastroVenda) abrirJanela(principal, cadVenda, DialogCadastroVenda.class);
    }

    public void msgWIP(Component comp) {
        LDASwingUtils.message(comp, "Essa fucionalidade ainda não esta pronta", "Em Breve");
    }

    public void msgBuscaCompleta() {
        JOptionPane.showMessageDialog(
                principal,
                "A busca retornou resultados!",
                "SISTEMA",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void msgAguardarProcesso() {
        JOptionPane.showMessageDialog(
                principal,
                "Aguardando o Processamento",
                "SISTEMA",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void sair() {
        System.exit(0);
    }

    public void log(String txt) {
        System.out.println("[LOG] " + txt);
    }

    public void carregarCombo(JComboBox combo, Class classe) {
        try {
            List lista = daoManager.listar(classe);
            LDASwingUtils.loadListInComboBox(combo, lista);
        } catch (HibernateException | ClassNotFoundException ex) {
            LDASwingUtils.messageError(principal, ex.toString(), "Cadastro de Cliente");
        }
    }

    public static void main(String args[]) {

        // TRADUÇÃO
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim");
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        javax.swing.UIManager.put("OptionPane.cancelButtonText", "Cancelar");

        /*
         * Create and display the form
         */
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirPrincipal();
    }

//    INTERAÇÕES COM A DAO
    
//    generico
    public List listar(Class classe) throws HibernateException, ClassNotFoundException {
        List lista = daoManager.listar(classe);
        return lista;
    }

//    cliente
    public List<Cliente> pesquisarCliente(String pesq, int tipo) throws HibernateException, ClassNotFoundException {
        return daoManager.pesquisarCliente(pesq, tipo);
    }
    
    public Cliente inserirCliente(String nome, String cpf, String email, String tel,Icon Foto,Endereco endereco,Cidade cidade) throws HibernateException, ClassNotFoundException {
        return daoManager.InserirCliente(nome, cpf, email, tel, Foto, endereco, cidade);
    }
    
    public Cliente alterarCliente(Cliente cliSelecionado, String nome, String cpf, String email, String tel, Icon Foto, Cidade cidade) throws HibernateException, ClassNotFoundException {
        return daoManager.alterarCliente(cliSelecionado, nome, cpf, email, tel, Foto, cidade);
    }
    
    public void abrirRelatorioClientes() throws HibernateException, ClassNotFoundException {
        RelatorioManager rel = getRelManager();
        List<Cliente> Clientes = daoManager.listar(Cliente.class);

        rel.relComLista(principal, Clientes, "reGeral.jasper");
    }
    
//    venda;
    public List<Venda> pesquisarVenda(String pesq, int tipo) throws HibernateException, ClassNotFoundException {
        return daoManager.pesquisarVenda(pesq, tipo);
    }
    
    public Venda inserirVenda(Cliente cliSelecionado,List ListaItensVenda) throws HibernateException, ClassNotFoundException {
        return daoManager.inserirVenda(cliSelecionado, ListaItensVenda);
    }
    
    public void  carregarItensVenda(Venda venda) throws HibernateException, ClassNotFoundException {
        daoManager.carregarItensPedido(venda);
    }
    
    public void abrirRelatorioVendas() {
        RelatorioManager rel = getRelManager();
        List<Venda> lista = daoManager.pesquisarParaRelatorioVenda();

        rel.relComLista(principal, lista, "reVendas.jasper");
    }
    
//    erva
    public Erva inserirErva(String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricao) throws HibernateException, ClassNotFoundException {
        return daoManager.InserirErva(nome, sabor, peso, valor, qtdeEstoque, descricao);
    }
    
    public Erva alterarErva(Erva ervaSelecionada, String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricao) throws HibernateException, ClassNotFoundException {
        return daoManager.alterarErva(ervaSelecionada, nome, sabor, peso, valor, qtdeEstoque, descricao);
    }
    
    public void abrirRelatorioProdutos() throws HibernateException, ClassNotFoundException {
        RelatorioManager rel = getRelManager();
        List<Erva> lista = daoManager.listar(Erva.class);

        rel.relComLista(principal, lista, "reErvas.jasper");
    }
}
