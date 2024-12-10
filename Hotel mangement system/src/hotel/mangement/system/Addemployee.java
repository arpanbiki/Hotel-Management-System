
package hotel.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Addemployee extends JFrame implements ActionListener{
    
   
    JTextField tname, tage, tsalary, tphone, tmail, taadhar;
    JRadioButton  tmale, tfemale; 
    JButton submit;
    JComboBox cbjob;
            
    Addemployee()
    {
    setLayout(null);
    
    JLabel laname = new JLabel("Name");
    laname.setBounds(60,30,120,30);
    laname.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(laname);
    
    
    tname = new JTextField();
    tname.setBounds(200,30,150,30);
    add(tname);
    
    JLabel lage = new JLabel("Age");
    lage.setBounds(60,80,120,30);
    lage.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lage);
    
    tage = new JTextField();
    tage.setBounds(200,80,150,30);
    add(tage);
    
    JLabel lagender = new JLabel("Gender");
    lagender.setBounds(60,130,120,30);
    lagender.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lagender);
    
     tmale = new JRadioButton("Male");
    tmale.setBounds(200,130,70,30);
    tmale.setFont(new Font("Tahoma",Font.PLAIN,13));
    tmale.setBackground(Color.yellow);
    add(tmale);
    
     tfemale = new JRadioButton("Female");
    tfemale .setBounds(280,130,70,30);
    tfemale .setFont(new Font("Tahoma",Font.PLAIN,13));
    tfemale .setBackground(Color.yellow);
    add(tfemale );
    
        ButtonGroup bg = new ButtonGroup();
        bg.add(tmale);
        bg.add(tfemale);
     
    
    JLabel ljob = new JLabel("Job");
    ljob.setBounds(60,180,120,30);
    ljob.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(ljob);
    
    String str[]={"Porters","Kitchen Staff","Front Desk Staff","HouseKeeping","Room Service","Chefs","Waiters","Manager","Accontant"};
     cbjob = new JComboBox(str);
    cbjob.setBounds(200,180,150,30);
    cbjob.setBackground(Color.yellow);
    add(cbjob);
    
    
     JLabel lsalary = new JLabel("Salary");
    lsalary.setBounds(60,230,120,30);
    lsalary.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lsalary);
    
     tsalary = new JTextField();
    tsalary .setBounds(200,230,150,30);
    add(tsalary);
    
     JLabel lphone = new JLabel("Phone");
    lphone.setBounds(60,280,120,30);
    lphone.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lphone);
    
     tphone = new JTextField();
    tphone.setBounds(200,280,150,30);
    add(tphone);
    
    
     JLabel lemail = new JLabel("Email");
    lemail.setBounds(60,330,120,30);
    lemail.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(lemail);
    
     tmail = new JTextField();
    tmail.setBounds(200,330,150,30);
    add(tmail);
    
    
    
     JLabel laadhar = new JLabel("Aadhar no.");
    laadhar.setBounds(60,380,120,30);
    laadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
    add(laadhar);
    
    taadhar = new JTextField();
     taadhar.setBounds(200,380,150,30);
    add(taadhar);
    
    submit = new JButton("SUBMIT");
    submit.setBackground(Color.black);
    submit.setForeground(Color.yellow);
    submit.setBounds(200,430,150,30);
    submit.addActionListener(this);
    add(submit);
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
    Image i2 =i1.getImage().getScaledInstance(450, 450,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(380,60,450,370);
    add(image);
    
    
    
    getContentPane().setBackground(Color.yellow);
    setBounds(350,200,850,540);
    setVisible(true);
}
    public void actionPerformed(ActionEvent ae){

         String name= tname.getText();
         String age = tage.getText();
     
         String salary = tsalary.getText();
         String phone = tphone.getText();
         String email = tmail.getText();
         String aadhar = taadhar.getText();

         String gender = null;
         
         if(tmale.isSelected())
         {
             gender = "Male";
            
         }
         else if(tfemale.isSelected())
         {
             gender = "Female";
         }
         
         String job =(String) cbjob.getSelectedItem();
         
         try{
             Cone conn = new Cone();
             
             String query = " insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
             conn.s.executeUpdate(query);
                
             JOptionPane.showMessageDialog(null,"Employee add successfully");
                     setVisible(false);
                     
         } catch (Exception e)
         {
             e.printStackTrace();
         }
    }
    
    
    
    public static void main(String[] args)
    {
        new Addemployee();
    }
    }
