/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MsgBox {
    public static void alert(Component parent,String message){
    JOptionPane.showMessageDialog(parent,message,"Cửa hàng bán sách", JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean comfirm(Component parent,String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,"Cửa hàng bán sách",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    public static String prompt(Component parent,String message) {
        return JOptionPane.showInputDialog(parent, message,"Cửa hàng bán sách", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
