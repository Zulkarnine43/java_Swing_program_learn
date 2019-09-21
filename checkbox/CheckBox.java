/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shaon
 */
public class CheckBox extends JFrame{
    private Container c;
    private JCheckBox javacheckbox,cCheckbox,mysqlCheckbox;
    private ButtonGroup grp;
    private Font f;
    private JLabel label;
    CheckBox(){
        initComponents();
    }
  public void initComponents(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(200, 50, 500, 400);
       this.setTitle("CheckBox Demo");
       f=new Font("Arial",Font.BOLD,20);
       
        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
       grp=new ButtonGroup();
        
        javacheckbox=new JCheckBox("java");
        //javacheckbox.setSelected(true);
        javacheckbox.setBounds(50,100,100,30);
        javacheckbox.setBackground(Color.MAGENTA);
         c.setFont(f);
        c.add(javacheckbox);
        
        cCheckbox=new JCheckBox("c",true);
        cCheckbox.setBounds(50,130,100,30);
        cCheckbox.setBackground(Color.MAGENTA);
         c.setFont(f);
        c.add(cCheckbox);
        
        
        mysqlCheckbox=new JCheckBox("mysql");
        mysqlCheckbox.setBounds(50,160,100,30);
        mysqlCheckbox.setBackground(Color.MAGENTA);
        c.setFont(f);
        c.add(mysqlCheckbox);
        grp.add(cCheckbox);
        grp.add(javacheckbox);
        grp.add(mysqlCheckbox);
        
        
        label =new JLabel("You have selected anything");
        label.setBounds(50,200,300,30);
        label.setFont(f);
        c.add(label);
        Handler handler = new Handler();
        javacheckbox.addActionListener(handler);
        cCheckbox.addActionListener(handler);
        mysqlCheckbox.addActionListener(handler);
        
  }
  class Handler implements ActionListener{
   
        @Override
        public void actionPerformed(ActionEvent e) {
           // if(e.getSource()==javacheckbox)
           if(javacheckbox.isSelected()){
               label.setText("You have selected java");
           }
           // if(e.getSource()==cCheckbox)
          else  if(cCheckbox.isSelected()){
               label.setText("You have selected C");
           }
            
             else{
                label.setText("You have selected m  mysql");
           }
        }
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckBox frame = new CheckBox();
        frame.setVisible(true);
    }

    
}
