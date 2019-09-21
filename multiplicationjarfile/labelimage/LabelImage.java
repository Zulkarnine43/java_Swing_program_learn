/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelimage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shaon
 */
public class LabelImage extends JFrame {
    
     private Container c;
     private JLabel imgLabel;
     private ImgIcon img;
   
    
    LabelImage(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        img = new ImgIcon(getClass().getResource("icon.png"));
            imgLabel= new JLabel((Icon) img);
            imgLabel.setBounds(50, 30, WIDTH, 200);
            //imgLabel.setBounds(50, 30,img./*getIconWidth*/(),img.getIconHeight());

            c.add(imgLabel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LabelImage frame = new LabelImage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 400, 500);
       frame.setTitle("This is label");
    }

       
}
