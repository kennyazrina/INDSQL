/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.app;

import indsql.api.*;
import java.io.*;
import com.mysql.jdbc.Driver;
import java.sql.*;

/**
 *
 * @author Andhika
 */
public class IndSQLApp {
    public static void main(String args[]) {
        System.out.println("IndSQL 0.1");
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String statement;
            
            System.out.println("Enter your statement:");
            statement = br.readLine();
            
            System.out.println("");
            
            String sql = IndSQL.convertToSQL(statement);
            System.out.println("Resulting SQL statement:");
            System.out.println(sql);
            
            System.out.println("");
            
            System.out.println("Connecting to MySQL...");
            // TODO handle connection and execution here
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
