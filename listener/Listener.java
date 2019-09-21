/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shaon
 */
public class Listener extends JFrame implements ActionListener{
    private Container c;
 private JButton btn1,btn2,btn3; 
 
  Listener(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Combo Box demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
           
        btn1 = new JButton("red");
        btn1.setBounds(50, 50, 200, 50);
        c.add(btn1);
        
         btn2 = new JButton("green");
        btn2.setBounds(50, 110, 200, 50);
        c.add(btn2);
        
         btn3 = new JButton("blue");
        btn3.setBounds(50, 170, 200, 50);
        c.add(btn3);
        
        
     /**   btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               c.setBackground(Color.red);
            }
        
        });**/
     btn1.addActionListener(this);
     btn2.addActionListener(this);
     btn3.addActionListener(this);
        
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Listener frame = new Listener();
        frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btn1){
           c.setBackground(Color.red);
       }
        if(e.getSource()==btn2){
           c.setBackground(Color.green);
       }
         if(e.getSource()==btn3){
           c.setBackground(Color.blue);
       }
    }
    
}
