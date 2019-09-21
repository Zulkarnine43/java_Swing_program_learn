/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shaon
 */
public class JButtondemo extends JFrame {
    private Container c;
    private JButton btn1,btn2;
      private Font f;
      private Cursor cursor;
      private ImageIcon img1,img2;
 JButtondemo(){
        initComponents();
    }
    public void initComponents(){
          c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
         f=new Font("Arial",Font.BOLD,18);
         cursor = new Cursor(Cursor.HAND_CURSOR);
         
         
         img1= new ImageIcon(getClass().getResource("1.png"));
                 img2= new ImageIcon(getClass().getResource("2.png"));

        
       btn1 = new JButton("submit");
        // btn1 = new JButton(img1);
        btn1.setBounds(100,50,100,50);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.MAGENTA);
        btn1.setBackground(Color.green);
        c.add(btn1);
        
        
        btn2 = new JButton("clear");
        // btn2 = new JButton(img2);
        btn2.setBounds(200,50,100,50);
        btn2.setFont(f);
        btn2.setForeground(Color.MAGENTA);
        btn2.setBackground(Color.green);
        c.add(btn2);
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JButtondemo frame = new JButtondemo();
        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 500, 400);
       frame.setTitle("Jbutton Demo");
    }
    
}
