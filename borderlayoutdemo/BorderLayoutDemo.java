
package borderlayoutdemo;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Shaon
 */
public class BorderLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BorderLayout blayout;
      BorderLayoutDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Border Layout demo");
        
        c=this.getContentPane();
        blayout=new BorderLayout(10,2);
       // blayout.getHgap(10);
       // blayout.getVgap(2);
        c.setLayout(blayout);
        
        btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
        btn5= new JButton("5");
        
        c.add(btn1,BorderLayout.NORTH);
         c.add(btn2,BorderLayout.WEST);
          c.add(btn3,BorderLayout.CENTER);
           c.add(btn4,BorderLayout.EAST);
            c.add(btn5,BorderLayout.SOUTH);
        
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
    }
    
}
