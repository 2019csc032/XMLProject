

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db_Connect
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public void connect()
    {

        try {
            String host="jdbc:mysql://localhost:3306/xml";
            String uname="root";
            String upass="";
            con=DriverManager.getConnection(host, uname, upass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Db is connected");
    }


}