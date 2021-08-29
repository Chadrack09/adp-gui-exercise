package za.ac.cput.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import za.ac.cput.dbconnect.DBConnect;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     Aug 29, 2021 | 7:08:54 PM
 *
 */
public class UserDAO {
  
  
  public static void insertToDB(int id, String fname, String lname) throws SQLException {
    
    Connection con = DBConnect.makeConnection();
    String sql = "INSERT INTO users (user_id, first_name, last_name) VALUES (?, ?, ?)";
    
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1, id);
    ps.setString(2, fname);
    ps.setString(3, lname);
    
    int row = ps.executeUpdate();
    if(row > 0) {
      ps.close();
      con.close();
      System.out.println("Row inserted");
    }
    else {
      System.out.println("Could not insert row");
    }
  }
  
  public static void main(String[] args) throws SQLException {
    insertToDB(1, "James", "Doe");
  }
}
