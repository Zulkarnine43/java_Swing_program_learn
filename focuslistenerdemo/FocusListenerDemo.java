/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focuslistenerdemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class FocusListenerDemo extends JFrame {
      private Container c;
    private JTextArea ta;
   // private JTextField tf;
    private JButton btn;
 FocusListenerDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Mouse Motion demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        ta = new JTextArea();
        ta.setBounds(10, 20, 200, 200);
        c.add(ta);
        
        btn=new JButton("click");
        btn.setBounds(220, 30, 120, 50);
        c.add(btn);
        
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                ta.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                ta.setText("Focus Lost");
            }
        
        
        } );
       
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FocusListenerDemo frame = new FocusListenerDemo();
        frame.setVisible(true);
    }
    
}
