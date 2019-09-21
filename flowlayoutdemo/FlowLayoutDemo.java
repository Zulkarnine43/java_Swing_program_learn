/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayoutdemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shaon
 */
public class FlowLayoutDemo extends JFrame {
    private Container c;
    private FlowLayout layout;
   // private JButton btn1,btn2,btn3,btn4,btn5;
    private JButton button[];
 FlowLayoutDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Flow Layout demo");
        
        c=this.getContentPane();
        layout=new FlowLayout(FlowLayout.LEFT,10,15);
        c.setLayout(layout);
        c.setBackground(Color.green);
       
        button = new JButton[9];
        for(int i=0;i<9;i++){
            button[i]=new JButton(""+(i+1));
            c.add(button[i]);
        }
        
        
        
        
        /*  btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
        btn5= new JButton("5");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);*/
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
    }
    
}
