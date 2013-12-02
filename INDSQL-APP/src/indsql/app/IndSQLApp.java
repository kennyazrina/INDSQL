/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.app;

import indsql.api.*;
import java.io.*;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Andhika
 */
public class IndSQLApp {
    public static Connect driver;

    public static void main(String args[]) {
        // Edit this for swing
        // In swing, set connecion params with Connect.setConnectionParams()
        
        if (args.length > 0 && "-cli".equals(args[0])) {
            cliMain();
        }
        else {
            guiMain();
        }
    }

    public static void cliMain() {
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
            
            sql.execute();
            System.out.println(sql.getResultDump());
            sql.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void guiMain() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new MainFrame("INDSQL");
                frame.setSize(450, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }      
        });
    }
}
