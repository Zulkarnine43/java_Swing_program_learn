/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmessagedialogg;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaon
 */
public class ShowMessageDialogg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImageIcon img = new ImageIcon("icon.png");
        JOptionPane.showMessageDialog(null, "Enter a correct password","ERROR",1,img);
    }
    
}
