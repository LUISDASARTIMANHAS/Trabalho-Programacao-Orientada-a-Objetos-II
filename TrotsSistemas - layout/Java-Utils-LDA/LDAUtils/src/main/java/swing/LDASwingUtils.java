/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe utilitária contendo métodos para facilitar o uso de componentes Swing.
 * Esses métodos ajudam a exibir mensagens, alterar a aparência da interface,
 * controlar a edição e habilitação de componentes, entre outros.
 * 
 * @author LUIS DAS ARTIMANHAS
 */
public class LDASwingUtils {

    /**
     * Exibe uma mensagem de informação em uma janela de diálogo.
     * 
     * @param comp Componente pai para a janela de diálogo.
     * @param msg Mensagem a ser exibida.
     * @param title Título da janela de diálogo.
     */
    public static void message(Component comp, String msg, String title) {
        JOptionPane.showMessageDialog(
                comp,
                msg,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Exibe uma mensagem de erro em uma janela de diálogo.
     * 
     * @param comp Componente pai para a janela de diálogo.
     * @param msg Mensagem de erro a ser exibida.
     * @param title Título da janela de diálogo.
     */
    public static void messageError(Component comp, String msg, String title) {
        JOptionPane.showMessageDialog(
                comp,
                msg,
                title,
                JOptionPane.ERROR_MESSAGE
        );
    }

    /**
     * Exibe uma caixa de confirmação e retorna a escolha do usuário.
     * 
     * @param comp Componente pai para a janela de diálogo.
     * @param msg Mensagem a ser exibida.
     * @return O valor selecionado na caixa de diálogo (Sim, Não).
     */
    public static int messageConfirm(Component comp, String msg) {
        int opc = JOptionPane.showConfirmDialog(
                comp,
                msg,
                "CONFIRMAR OPERAÇÃO",
                JOptionPane.INFORMATION_MESSAGE
        );
        return opc;
    }

    /**
     * Alterna a propriedade de edição de um campo de texto (JTextField).
     * Se o campo for editável, ele se torna não editável, e vice-versa.
     * 
     * @param txt Campo de texto a ser modificado.
     */
    public static void toggleEditable(JTextField txt) {
        if (txt.isEditable()) {
            txt.setEditable(false);
        } else {
            txt.setEditable(true);
        }
    }

    /**
     * Alterna a habilitação de um componente JSpinner com base na seleção de um JCheckBox.
     * Se o JCheckBox estiver selecionado, o JSpinner será habilitado. Caso contrário, será desabilitado e seu valor é resetado.
     * 
     * @param chk O JCheckBox que controla o JSpinner.
     * @param spn O JSpinner a ser controlado.
     */
    private void toogleSpinner(JCheckBox chk, JSpinner spn) {
        if (chk.isSelected()) {
            spn.setEnabled(true);
        } else {
            spn.setEnabled(false);
            spn.setValue(0);
        }
    }

    /**
     * Alterna a habilitação de um campo de texto (JTextField).
     * Se o campo estiver habilitado, ele será desabilitado, e vice-versa.
     * 
     * @param txt Campo de texto a ser modificado.
     */
    public static void toggleEnabled(JTextField txt) {
        if (txt.isEnabled()) {
            txt.setEnabled(false);
        } else {
            txt.setEnabled(true);
        }
    }
    
     public static void addItemComboBox(JTextField txt) {
        if (txt.isEnabled()) {
            txt.setEnabled(false);
        } else {
            txt.setEnabled(true);
        }
    }

    /**
     * Alterna tanto a habilitação quanto a edição de um campo de texto (JTextField).
     * 
     * @param txt Campo de texto a ser modificado.
     */
    public static void toggleEnabledAndEditable(JTextField txt) {
        toggleEnabled(txt);
        toggleEditable(txt);
    }

    /**
     * Limpa o conteúdo de um campo de texto (JTextField).
     * 
     * @param txt Campo de texto a ser limpo.
     */
    public static void clearTxt(JTextField txt) {
        txt.setText("");
    }

    /**
     * Altera a aparência da interface (Look and Feel) com base no nome da classe e tipo fornecido.
     * 
     * @param NameClass Nome da classe do Look and Feel (não utilizado diretamente).
     * @param type Tipo de Look and Feel a ser aplicado.
     * @param comp Componente pai para a atualização visual.
     */
    public static void ChangeLookAndFeel(String NameClass, String type, Component comp) {
        // Tenta alterar para o Look and Feel especificado
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if (type.equals(info.getName())) {
                System.out.println("Changed Look And Feel to: " + info.getName());
                UpdateLookAndFeel(info.getClassName(), comp);
                break;
            }
        }
        // Caso o tipo seja um personalizado (FlatLaf)
        if (type.equals("com.formdev.flatlaf.FlatDarkLaf") || type.equals("com.formdev.flatlaf.FlatLightLaf")) {
            System.out.println("Changed Personal Look And Feel to: " + type);
            UpdateLookAndFeel(type, comp);
        }
    }

    /**
     * Aplica o Look and Feel especificado à aplicação.
     * 
     * @param className O nome da classe do Look and Feel.
     * @param comp Componente pai para a atualização visual.
     */
    public static void UpdateLookAndFeel(String className, Component comp) {
        try {
            javax.swing.UIManager.setLookAndFeel(className);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LDASwingUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LDASwingUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LDASwingUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LDASwingUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(comp);
    }

    /**
     * Retorna o valor do botão de rádio selecionado em um ButtonGroup.
     * 
     * @param btnGroup O ButtonGroup contendo os botões de rádio.
     * @return O valor (mnemonic) do botão de rádio selecionado.
     */
    public static char getSelectedRadioButton(ButtonGroup btnGroup) {
        char selected = (char) btnGroup.getSelection().getMnemonic();
        System.out.println(btnGroup.getSelection().getActionCommand());
        return selected;
    }
}