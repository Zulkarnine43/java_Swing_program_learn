
package frame;

//import javax.swing.JFrame;

import javax.swing.JFrame;


/**
 *
 * @author Shaon
 */
public class Frame extends JFrame {

    /**
     * @param args the command line arguments
     */
   /** Frame(){
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(200, 50, 400, 500);
       setTitle("Frame demo");
         setResizable(false);
    }**/
    public static void main(String[] args) {
        // TODO code application logic here
       // Frame f = new Frame();
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // frame.setSize(400, 300);
      // frame.setLocation(200, 50);
       frame.setBounds(200, 50, 400, 500);
       frame.setTitle("Frame demo");
       frame.setResizable(false);
    }
    
}
