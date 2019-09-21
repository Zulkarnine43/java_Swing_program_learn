/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shaon
 */
public class NewFrame extends JFrame {
    private Container c;
    private JLabel label;
    NewFrame(){
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 420, 350);
        this.setTitle("New Frame");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        
        label = new JLabel("Welcome to the new frame");
        label.setBounds(50,50,200,50);
        c.add(label);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         NewFrame frame = new NewFrame();
        frame.setVisible(true);
    }
    
}
