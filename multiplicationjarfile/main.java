/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationjarfile;

import javax.swing.JFrame;

/**
 *
 * @author Shaon
 */
public class main {
    public static void main(String[] args) {
        multiplicationJarFile.multiplicationJarFile frame= new multiplicationJarFile.multiplicationJarFile();
        frame.setVisible(true);
        frame.setBounds(300,20,360,700);
        frame.setTitle("MultiplicationTable Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
