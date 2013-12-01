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
    public static void main(String args[]) {
        String arg = args.length > 0 ? args[0] : "";
        
        switch (arg.toLowerCase()) {
            case "-h":
            case "-help":
            case "-?":
                System.out.println("Options:\n-? Show this screen\n-i Init database");
                break;
            case "-i":
            case "-init":
                dbInitMain();
                break;
            default:
                defaultMain();
        }
    }

    private static void dbInitMain() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void defaultMain() {
        System.out.println("IndSQL 0.1\n");
        
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
