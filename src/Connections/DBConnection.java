package Connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public Connection con;

    public Connection ConnectDB()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manage");
            System.out.println("CONNECTION SUCCEDED!");
            return con;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return con;
        }
    }
}
