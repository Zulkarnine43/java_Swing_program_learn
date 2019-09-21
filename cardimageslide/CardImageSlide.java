/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardimageslide;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Shaon
 */
public class CardImageSlide extends JFrame implements ActionListener{
    private Container c;
    private JPanel panel;
    private JButton preBtn,nxtBtn;
    private ImageIcon image;
    private JLabel label;
    private CardLayout card;
     CardImageSlide(){
        initComponents();
        showImage();
    }
     public void showImage(){
         String[] imageNames={"a1.png","a3.png","a5.png"};
         for(String n:imageNames){
             //image = new ImageIcon("src/"+n);
               image = new ImageIcon(getClass().getResource(n));
             //Resizing the image
             Image img=image.getImage();
             Image newImage=img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
               image = new ImageIcon(newImage);
               label=new JLabel(image);
             panel.add(label);
         }
     }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("slide demo");
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        card=new CardLayout();
        
        panel = new JPanel(card);
        panel.setBounds(10,10,560,380);
        c.add(panel);
        preBtn=new JButton("previous");
        preBtn.setBounds(10, 400, 100, 50);
        c.add(preBtn);
        
         nxtBtn=new JButton("Next");
        nxtBtn.setBounds(470, 400, 100, 50);
        c.add(nxtBtn);
        
        preBtn.addActionListener(this);
        nxtBtn.addActionListener(this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CardImageSlide frame = new CardImageSlide();
        frame.setVisible(true);
    }

    @Override
   
    public void actionPerformed(ActionEvent e) {
  if(e.getSource()==preBtn){
      card.previous(panel);
  }
  else if(e.getSource()==nxtBtn){
      card.next(panel);
  }
    }
    
}
