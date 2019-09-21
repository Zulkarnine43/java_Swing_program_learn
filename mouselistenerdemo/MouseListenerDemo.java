/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselistenerdemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class MouseListenerDemo extends JFrame {
 private Container c;
 private JTextField tf;
    private JTextArea ta;
    private JScrollPane sp;
  MouseListenerDemo(){
        initComponents();
    }
    public void initComponents(){
    
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Mouse Box demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        
        tf=new JTextField();
        tf.setBounds(20, 20, 150, 50);
        c.add(tf);
        
        ta=new JTextArea();
       // ta.setBounds(10, 80, 300, 300);
        ta.setBackground(Color.pink);
        //c.add(ta);
        
        sp=new JScrollPane(ta);
        sp.setBounds(10, 80, 300, 300);
        c.add(sp);
        
        
        
        tf.addMouseListener(new MouseListener(){
          @Override
          public void mouseClicked(MouseEvent e) {
              ta.append("Mouse Clicked\n");
          }

          @Override
          public void mousePressed(MouseEvent e) {
           ta.append("Mouse pressed\n");
          }

          @Override
          public void mouseReleased(MouseEvent e) {
          ta.append("Mouse Released\n");
          }

          @Override
          public void mouseEntered(MouseEvent e) {
           ta.append("Mouse Entered\n");
          }

          @Override
          public void mouseExited(MouseEvent e) {
           ta.append("Mouse Exited\n");
          }
        
        });
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          MouseListenerDemo frame = new MouseListenerDemo();
        frame.setVisible(true);
    }
    
}
