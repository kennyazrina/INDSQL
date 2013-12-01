/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.app;

import indsql.api.*;
import java.io.*;

/**
 *
 * @author Andhika
 */
public class IndSQLApp {
    public static Connect driver;

    public static void main(String args[]) {
        System.out.println("IndSQL 0.1\n");
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String statement;
            
            System.out.println("Enter your statement:");
            statement = br.readLine();
            
            System.out.println("");
            
            SqlStatement sql = IndSQL.convertToSQL(statement);
            System.out.println("Resulting SQL statement:");
            System.out.println(sql.getSQL());
            
            System.out.println("");
            
            System.out.println("Connecting to MySQL...");
            driver = new Connect();

            sql.executeQuery();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
