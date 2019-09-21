/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbuttonactionlistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class JButtonActionListener extends JFrame {

     private Container c;
    private JButton btn1,btn2;
      private Font f;
      private Cursor cursor;
      private ImageIcon img1,img2;
      private JTextField text;
 JButtonActionListener(){
        initComponents();
    }
    public void initComponents(){
          c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        
        text = new JTextField();
        text.setBounds(50, 50, 150, 50);
        c.add(text);
        
        
         f=new Font("Arial",Font.BOLD,18);
         cursor = new Cursor(Cursor.HAND_CURSOR);
         
         
       //  img1= new ImageIcon(getClass().getResource("1.png"));
                // img2= new ImageIcon(getClass().getResource("2.png"));

        
       btn1 = new JButton("submit");
       //  btn1 = new JButton(img1);
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
        
        btn2.addActionListener(new ActionListener () {
        public void actionPerformed(ActionEvent e){ 
        text.setText("");
        
        }
        
        });
        }

  

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JButtonActionListener frame = new JButtonActionListener();
        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 500, 400);
       frame.setTitle("Jbutton Demo");
    }
    
}

