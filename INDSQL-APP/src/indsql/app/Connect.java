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
    public Connect() throws SQLException{
        makeConnection();
    } 

    private Connection koneksi;  

     public  Connection makeConnection() throws SQLException {
        if (koneksi == null) {
             new Driver();
            // buat koneksi
             koneksi = DriverManager.getConnection(
                       "jdbc:mysql://localhost:3306/school",
                       "root",
                       "");
         }
         return koneksi;
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
