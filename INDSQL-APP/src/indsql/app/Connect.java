/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.app;

import com.mysql.jdbc.Driver;
import java.sql.*;

/**
 *
 * @author kaniaazrina
 */
public class Connect {
    private static Connection koneksi;
    private static Driver driver;
    
    public Connect() throws SQLException{
        makeConnection();
    }
    
    public Connection getConnection() {
        return koneksi;
    }

    public void makeConnection() throws SQLException {
        if (koneksi == null) {
            driver = new Driver();

            // buat koneksi
            koneksi = DriverManager.getConnection(
                       "jdbc:mysql://localhost:3306/school",
                       "root",
                       "");
         }
    }  

     public static void main(String args[]) {
         try {
             Connect c = new Connect();
             System.out.println("Connection established");
         }
         catch (SQLException e) {
             e.printStackTrace();
             System.err.println("Connection Failure");
         }  

    }
}
