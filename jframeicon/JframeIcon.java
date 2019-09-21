/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframeicon;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class JframeIcon extends JFrame {
    //private ImageIcon icon;
    private Container c;
    JframeIcon(){
        initComponents();
    }
    public void initComponents(){
        
       // Container c=new Container();
        c=this.getContentPane();
        c.setBackground(Color.GREEN);
        
         ImageIcon icon =new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JframeIcon frame = new JframeIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200, 50, 400, 500);
       frame.setTitle("Frame demo");
       frame.setResizable(false);
    }
    
}
