/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actiondemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class ActionDemo extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    ActionDemo(){
        initComponents();
    }
    public void initComponents(){
        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        tf1= new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);
        
         tf2= new JTextField();
        tf2.setBounds(50, 100, 150, 50);
        c.add(tf2);
        
        Handler handler = new Handler();
        tf1.addActionListener(handler);
                tf2.addActionListener(handler);

        
        
    }
    class Handler implements ActionListener{
         public void actionPerformed(ActionEvent e){
         if(e.getSource()==tf1){
             String s = tf1.getText();
             if(s.isEmpty()){
             JOptionPane.showMessageDialog(null,"You didnt enter anything");
             }
             else{
                             JOptionPane.showMessageDialog(null,"tf1 ="+s);
 
             }
         }
         else{
             String s = tf2.getText();
             if(s.isEmpty()){
             JOptionPane.showMessageDialog(null,"You didnt enter anything");
             }
             else{
                             JOptionPane.showMessageDialog(null,"tf2 ="+s);
 
             }
         }
             
         }
    }
        
        
        /**tf1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             String s = tf1.getText();
             if(s.isEmpty()){
             JOptionPane.showMessageDialog(null,"You didnt enter anything");
             }
             else{
                             JOptionPane.showMessageDialog(null,"tf1 ="+s);
 
             }
             }
        
        
        });
        
        
    **/
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ActionDemo frame = new ActionDemo();
        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 400, 500);
       frame.setTitle("ActionListener Demo");
    }
    
}
