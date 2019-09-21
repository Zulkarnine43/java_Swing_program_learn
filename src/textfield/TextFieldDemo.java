/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfield;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class TextFieldDemo extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    
TextFieldDemo(){
    initComponent();
}
public void initComponent(){
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.PINK);
    
    f= new Font("Arial",Font.ITALIC+Font.BOLD,18);
    
    tf1 = new JTextField();
    tf1.setBounds(50,50,200,50);
    tf1.setFont(f);
    tf1.setForeground(Color.yellow);
    tf1.setBackground(Color.GREEN);
    tf1.setHorizontalAlignment(JTextField.RIGHT);
    c.add(tf1);
    
     tf2 = new JTextField();
     tf2.setText("Zulkar Nine");
    tf2.setBounds(50,110,200,50);
     tf2.setFont(f);
    c.add(tf2);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 400, 500);
       frame.setTitle("This is label");
    }
    
}
