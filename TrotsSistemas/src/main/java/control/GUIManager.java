/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import domain.Cliente;
import domain.Erva;
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
    private DialogCadastroProduto cadProd = null;
    private DialogCadastroVenda cadVenda = null;

    private DaoManager daoManager;

    // ########  SINGLETON  #########
   
    private GUIManager() {
        try {
            daoManager = new DaoManager();
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

    // ######### SINGLETON ###########
    // ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
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
    
    public Erva abrirBuscaVenda() {
        buscaProd = (DialogBuscaProd) abrirJanela(principal, buscaProd, DialogBuscaProd.class);
        return buscaProd.getErvaSelecionada();
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

    public void abrirRelatorioCli() {
        msgWIP(principal);
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

    public void carregarCombo(JComboBox combo, Class classe) {
        try {
            List lista = daoManager.listar(classe);
            LDASwingUtils.loadListInComboBox(combo,lista);
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

}
