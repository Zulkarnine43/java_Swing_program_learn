/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobuttondemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author Shaon
 */
public class RadioButtonDemo extends JFrame {
    private Container c;
    private JRadioButton male,female;
    private  ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    RadioButtonDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("Radio Button");
        
        
        f=new Font("Arial",Font.BOLD,20);
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        
        grp=new ButtonGroup();
        
        male= new JRadioButton("male");
        male.setBounds(50,50,100,50);
        male.setFont(f);
        male.setBackground(Color.ORANGE);
        c.add(male);
        male.setSelected(true);
         female= new JRadioButton("female");
        female.setBounds(160,50,100,50);
        female.setFont(f);
        female.setBackground(Color.ORANGE);
        c.add(female);
        //female.setEnabled(false);
        grp.add(male);
        grp.add(female);
        
        ta= new JTextArea();
        ta.setBounds(20,110,200,200);
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setBackground(Color.pink);
        c.add(ta);
        
        
        Handler handler=new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
        
        
        
        
        
    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          if(e.getSource()==male){
        ta.append("You have selected male\n");
    } 
else{
        ta.append("You have selected female\n");
    }
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RadioButtonDemo frame = new RadioButtonDemo();
    frame.setVisible(true);
    }
    
    }
