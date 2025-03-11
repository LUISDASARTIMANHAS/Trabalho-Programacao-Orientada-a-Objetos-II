/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.swing.JTextField;

/**
 *
 * @author 2023122760328
 */
public class SwingUtils {

    public static void toggleEditable(JTextField txt) {
        if (txt.isEditable()) {
            txt.setEditable(false);
        } else {
            txt.setEditable(true);
        }

    }

    public static void toggleEnabled(JTextField txt) {
        if (txt.isEnabled()) {
            txt.setEnabled(false);
        } else {
            txt.setEnabled(true);
        }

    }

    public static void toggleEnabledAndEditable(JTextField txt) {
        toggleEnabled(txt);
        toggleEditable(txt);

    }

}
