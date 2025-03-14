/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

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

    private GUIManager() {
    }

    public static GUIManager getMyInstance() {
        return myInstance;
    }

    public void abrirPrincipal() {
        principal = new Principal();
        SwingUtils.ChangeLookAndFeel(Principal.class.getName(), "Metal",principal);
        principal.setVisible(true);
    }

    public void abrirCadCli() {
        cadCli = new DialogCadastro(principal, true);
        cadCli.setVisible(true);
    }

    public static void main(String args[]) {

        /*
         * Create and display the form
         */
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirPrincipal();
    }
}
