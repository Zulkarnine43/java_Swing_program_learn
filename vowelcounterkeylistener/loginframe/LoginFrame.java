
package loginframe;
//import NewFrame.NewFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    private JLabel userlabel,passlabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton submitButton,clearButton;
    private Container c;
    private Font f;
    LoginFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 420, 350);
        this.setTitle("Login Demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        f= new Font("Arial",Font.BOLD,19);
        userlabel = new JLabel("Username");
        userlabel.setBounds(50,50,150,50);
        userlabel.setFont(f);
        c.add(userlabel);
        
         tf= new JTextField ();
        tf.setFont(f);
        tf.setBounds(170, 50, 200, 50);
        c.add(tf);
       
        
        
        passlabel = new JLabel("password");
        passlabel.setBounds(50,120,150,50);
        
        passlabel.setFont(f);
        c.add(passlabel);
         pf= new JPasswordField ();
        pf.setFont(f);
        pf.setBounds(170, 120, 200, 50);
        pf.setEchoChar('*');
        c.add(pf);
        
        
        submitButton= new JButton("login");
        submitButton.setBounds(170,190,90,50);
        c.add(submitButton);
        
        clearButton= new JButton("clear");
        clearButton.setBounds(280,190,90,50);
        c.add(clearButton);
        clearButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tf.setText("");
            pf.setText("");
        }
        
        });
        
        
        submitButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String username=tf.getText();
            String Password=pf.getText();
            
            if(username.equals("Zulkar Nine") && Password.equals("123")){
                JOptionPane.showMessageDialog(null,"You are sucessfully login");
                //dispose();
                /////NewFrame frame =new NewFrame();
               // frame.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Username or password"); 
            }
        }
        
        });
        
        
        
        
        
        
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        
    }
    
}
