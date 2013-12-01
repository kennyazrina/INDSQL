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
    private static String dbName = "school";
    private static String dbUser = "root";
    private static String dbPass = "";
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
                       "jdbc:mysql://localhost:3306/" + dbName,
                       dbUser,
                       dbPass);
         }
    }
    
    public static void setConnectionParams(String databaseName, String databaseUser, String databasePassword) {
        dbName = databaseName;
        dbUser = databaseUser;
        dbPass = databasePassword;
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
