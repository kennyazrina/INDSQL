/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.app;
import java.sql.*;

/**
 *
 * @author kaniaazrina
 */
public class SqlStatement {
    private Statement statement;
    
    public SqlStatement() throws SQLException{
        makeStatement();
    }
    public Statement makeStatement() throws SQLException{
        Connect c = new Connect();
        Connection conn = c.makeConnection();
        statement = conn.createStatement();
        return statement;
    }
    public void insert(String nama,int npm)throws SQLException{
        statement.execute("insert into student values(\""+nama+"\","+npm+")");
    }
    public static void main(String arg[]){
        try {
            SqlStatement s = new SqlStatement();
            s.insert("Gichi",1);
            s.insert("Kania",2);
            s.insert("Nunu",3);
            System.out.println("Success");
        }
        catch(SQLException e){
            System.out.println("Failed");
            e.printStackTrace();
        }
    }
}
