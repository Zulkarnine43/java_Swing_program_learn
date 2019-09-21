/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *
 * @author Shaon
 */
public class JPassword extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font f;
    
     JPassword(){
        initComponents();
    }
    public void initComponents(){
        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        f=new Font("Arial",Font.BOLD,18);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(50, 20, 150, 50);
        pf.setForeground(Color.black);
        pf.setBackground(Color.green);
        pf.setFont(f);
        c.add(pf);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JPassword frame = new JPassword();
        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 500, 400);
       frame.setTitle("ActionListener Demo");
    }
    
}
