
package hotel.mangement.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
    JButton newCustomer, rooms , department, allEmployee, managerinfo, customers;
    
    Reception()
    {
        getContentPane ().setBackground(Color.white);
        setLayout(null);
        
       
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.white);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.white);
        rooms.addActionListener(this);
        add(rooms);
        
        department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.black);
        department.setForeground(Color.white);
        department.addActionListener(this);
        add(department);
        
        allEmployee = new JButton("All Employee");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.black);
        allEmployee.setForeground(Color.white);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
        customers = new JButton("Customer Info");
        customers.setBounds(10,190,200,30);
        customers.setBackground(Color.black);
        customers.setForeground(Color.white);
        customers.addActionListener(this);
        add(customers);
        
        managerinfo = new JButton("Manager Info");
        managerinfo.setBounds(10,230,200,30);
        managerinfo.setBackground(Color.black);
        managerinfo.setForeground(Color.white);
        managerinfo.addActionListener(this);
        add(managerinfo);
        
        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.white);
        add(checkout);
        
        JButton update = new JButton("Update status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        add(update);
        
        JButton roomstatus = new JButton("Update Room status");
        roomstatus.setBounds(10,350,200,30);
        roomstatus.setBackground(Color.black);
        roomstatus.setForeground(Color.white);
        add(roomstatus );
        
        JButton pickup = new JButton("Pickup status");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.black);
        pickup.setForeground(Color.white);
        add(pickup);
        
        JButton searchroom = new JButton("Search Room");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.black);
        searchroom.setForeground(Color.white);
        add(searchroom);
        
        JButton logout = new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        add(logout);
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
        
        
        
        
        setBounds(350,200,800,570);
        setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae)       
     {
         
         if(ae.getSource()== newCustomer)
         {
             setVisible(false);
             new AddCustomer();
         }
         else if(ae.getSource() == rooms)
         {
             setVisible(false);
             new Rooms();
         }
          else if(ae.getSource() == department)
         {
             setVisible(false);
             new Department();   
     }
          else if(ae.getSource()== allEmployee)
         {
             setVisible(false);
             new Employeeinfo();
         }
         
          else if(ae.getSource()== allEmployee)
         {
             setVisible(false);
             new Employeeinfo();
         }
          else if(ae.getSource()== managerinfo)
         {
             setVisible(false);
             new Managerinfo();
         }
          else if(ae.getSource()== customers)
         {
             setVisible(false);
             new Customerinfo();
         }
     }
     
      public static void main(String[] args)
     {
       new Reception();
     }
}
