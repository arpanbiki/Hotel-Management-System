
package hotel.mangement.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener
{
    Dashboard()
            {
         setBounds(0,0,2550,2000);
         setLayout(null);
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
         Image i2 = i1.getImage().getScaledInstance(2550,1200,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0,0,2550,1200);
         add(image);
           JLabel text = new JLabel(" THE HOTEL OBERAI WELCOMES YOU");
           text.setBounds(600,100,1000,100);
           text.setForeground(Color.WHITE);
           text.setFont(new Font("Tahoma",Font.PLAIN,47));
             image.add(text);
             
             JMenuBar mb = new JMenuBar();
             mb.setBounds(0,0,2550,30);
             image.add(mb);
             
             JMenu hotel= new JMenu("HOTEL MANAGEMENT");
             hotel.setForeground(Color.BLACK);
             mb.add(hotel);
             
             
             JMenuItem  reception = new JMenuItem("RECEPTION");
             reception.addActionListener(this);
             hotel.add(reception);
             
             JMenu admin= new JMenu("ADMIN");
             hotel.setForeground(Color.red);
             mb.add(admin); 
             
             JMenuItem  addemployee = new JMenuItem("ADD EMPLOYEE");
             addemployee.addActionListener(this);
             admin.add(addemployee);
             
             JMenuItem  addrooms = new JMenuItem("ADD ROOMS");
             addrooms.addActionListener(this);
             admin.add(addrooms);
             
             JMenuItem  adddriver = new JMenuItem("ADD DRIVERS");
             adddriver.addActionListener(this);
             admin.add(adddriver);
             
          setVisible(true);
            }
    
      public void actionPerformed(ActionEvent ae){
          if(ae.getActionCommand().equals("ADD EMPLOYEE"))
          {
             new Addemployee();
      }
          else if(ae.getActionCommand().equals("ADD ROOMS"))
          {
             new AddRooms();
          }
             else if(ae.getActionCommand().equals("ADD DRIVERS"))
          {
             new AddDriver();
          }
              else if(ae.getActionCommand().equals("RECEPTION"))
          {
             new Reception();
      }
}
    public static void main(String[] args)
    {
        new Dashboard();
    }
}
