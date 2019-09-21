/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabelwithimage;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shaon
 */
public class JlabelWithImage extends JFrame {
     private Container c;
     private JLabel label;
     private ImageIcon image;
   
 JlabelWithImage(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Jlabel Image demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        image = new ImageIcon(getClass().getResource("2.png"));
       label = new JLabel("Icon image",image,JLabel.LEFT);
     label.setBounds(50, 50, 250, 50);
     c.add(label);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JlabelWithImage frame = new JlabelWithImage();
        frame.setVisible(true);
    }
    
}
