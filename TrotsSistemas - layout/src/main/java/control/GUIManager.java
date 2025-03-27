/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import swing.LDASwingUtils;
import viwer.DialogCadastro;
import viwer.Principal;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class GUIManager {

    private static GUIManager myInstance = new GUIManager();
    private Principal principal;
    private DialogCadastro cadCli;

    private DaoManager daoManager;

    private GUIManager() {
        try {
            daoManager = new DaoManager();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);

            System.exit(-1);
        }
    }

    public static GUIManager getMyInstance() {
        return myInstance;
    }

    public void abrirPrincipal() {
        principal = new Principal();
        LDASwingUtils.ChangeLookAndFeel(Principal.class.getName(), "Metal", principal);
        principal.setVisible(true);
    }

    public void abrirCadCli() {
//        cadCli = new DialogCadastro(principal, true);
//        cadCli.setVisible(true);
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
            List Lista = daoManager.listarCidades();
            
            combo.setModel(new DefaultComboBoxModel(Lista.toArray()));
        } catch (SQLException | ClassNotFoundException ex) {
            LDASwingUtils.messageError(cadCli, ex.toString(), "CADASTRO DE CLIENTE");
            Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
