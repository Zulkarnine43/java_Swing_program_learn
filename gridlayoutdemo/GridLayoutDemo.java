/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayoutdemo;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shaon
 */
public class GridLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private GridLayout layout;
     GridLayoutDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("BOX Layout demo");
        c=this.getContentPane();
        layout=new GridLayout(2,2,5,5);
        c.setLayout(layout);
        
        
          btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
        btn5= new JButton("5");
        
        c.add(btn1);
         c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         GridLayoutDemo frame = new GridLayoutDemo();
        frame.setVisible(true);
    }
    
}
