package za.ac.cput.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     Aug 29, 2021 | 6:58:19 PM
 *
 */
public class DBConnect {
  
  public static Connection makeConnection() throws SQLException {
    
    String url = "jdbc:derby://localhost:1527/dbexercise";
    String user = "root";
    String password = "root";
    
    Connection con = DriverManager.getConnection(url, user, password);
    
    return con;
  }
  
  public static void main(String[] args) throws SQLException {
    System.out.println(makeConnection().getMetaData().getDriverName());
  }
}
