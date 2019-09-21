/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemovelistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class MousemoveListener extends JFrame  {
    private Container c;
    private JTextArea ta;
    private JTextField tf;
 MousemoveListener(){
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
        
        
          tf = new JTextField();
        tf.setBounds(220, 20, 150, 50);
        c.add(tf);
        
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Dragged :"+e.getX()+" "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse Moved :"+e.getX()+" "+e.getY());
            }
       
        
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MousemoveListener frame = new MousemoveListener();
        frame.setVisible(true);
    }
    
}
