
package hotel.mangement.system;

import java.sql.*;
 import java.sql.Connection;
public class Cone {
    Connection c;
    Statement s;
    Cone()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmangementsystem","root","bikiarpan");
        s = c.createStatement();
        
    }
        catch (Exception e )
        {
            e.printStackTrace();
        }
        }
    
}
