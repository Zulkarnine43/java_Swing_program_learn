/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textareademo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Shaon
 */
public class TextAreaDemo extends JFrame {
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scrollPane;
    TextAreaDemo(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
         f=new Font("Arial",Font.BOLD,18);
        
        ta = new JTextArea();
        ta.setBounds(50,50,300,200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setForeground(Color.red);
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        c.add(ta);
        
        
        scrollPane = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50,50,300,200);
        c.add(scrollPane);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextAreaDemo frame= new TextAreaDemo();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
