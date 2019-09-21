/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package label;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shaon
 */
public class Label extends JFrame {
    private Container c;
    private JLabel userlabel,passLebel; 
    private Font f;
    
    Label(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Arial",Font.BOLD,14);
        
        userlabel = new JLabel();
        userlabel.setText("Enter your name");
        userlabel.setBounds(50, 50,200, 50);
        userlabel.setFont(f);
        userlabel.setForeground(Color.GREEN);
        userlabel.setOpaque(true);
        userlabel.setBackground(Color.red);
        userlabel.setToolTipText("Enter Your Username");
        c.add(userlabel);
        
        //System.out.println(""+userlabel.getText());
       //String s=userlabel.getToolTipText();
        
        passLebel = new JLabel("Enter Your password");
        passLebel.setBounds(50, 80, 200, 50);
        passLebel.setFont(f);
        c.add(passLebel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Label frame = new Label();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 400, 500);
       frame.setTitle("This is label");
    }
    
}
