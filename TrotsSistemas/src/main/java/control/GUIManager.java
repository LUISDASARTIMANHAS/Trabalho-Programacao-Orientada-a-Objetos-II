/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import swing.*;
import viwer.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class GUIManager {

    private static GUIManager myInstance = new GUIManager();
    private Principal principal;
    private DialogCadastro cadCli;
    private DialogBuscaCli buscaCli;
    private DialogBuscaProd buscaProd;
    private DialogCadastroProduto cadProd;
    private DialogCadastroVenda cadVenda;

    private DaoManager daoManager;

    private GUIManager() {
        try {
            daoManager = new DaoManager();
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(null, ex);
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
    
    

    public void abrirPrincipal() {
        principal = new Principal();
        LDASwingUtils.ChangeLookAndFeel(Principal.class.getName(), "Metal", principal);
        getDaoManager();
        principal.setVisible(true);
    }

    public void abrirBuscaCli() {
        buscaCli = new DialogBuscaCli(principal, true);
        buscaCli.setVisible(true);
    }
    
    public void abrirBuscaProd() {
        buscaProd = new DialogBuscaProd(principal, true);
        buscaProd.setVisible(true);
    }
    
    public void abrirCadCli() {
        cadCli = new DialogCadastro(principal, true);
        cadCli.setVisible(true);
    }
    
    public void abrirCadProd() {
        cadProd = new DialogCadastroProduto(principal, true);
        cadProd.setVisible(true);
    }
    
    public void abrirCadVenda() {
        cadVenda = new DialogCadastroVenda(principal, true);
        cadVenda.setVisible(true);
    }
    
    public void abrirRelatorioCli() {
       msgWIP(principal);
    }
    public void msgWIP(Component comp) {
        JOptionPane.showMessageDialog(
                comp,
                "Essa fucionalidade ainda não esta pronta",
                "Em Breve",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    

    public void sair() {
        System.exit(0);
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
    
    
    public void loadComboCidade(JComboBox combo){
        try {
            List Lista = daoManager.listar();
            
            combo.setModel(new DefaultComboBoxModel(Lista.toArray()));
        } catch (HibernateException | ClassNotFoundException ex) {
            LDASwingUtils.messageError(cadCli, ex.toString(), "CADASTRO DE CLIENTE");
            Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
