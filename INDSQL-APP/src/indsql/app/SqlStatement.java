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
    private String sql;
    private String type;
    
    public SqlStatement() throws SQLException{
        makeStatement();
    }
    
    public SqlStatement(String sql, String type) {
        this.sql = sql;
        this.type = type;
    }
    
    public String getSQL() {
        return sql;
    }
    
    public String getType() {
        return type;
    }
    
    public Statement getStatement() {
        return statement;
    }

    public Statement makeStatement() throws SQLException{
        Connect c = new Connect();
        Connection conn = c.getConnection();
        statement = conn.createStatement();
        return statement;
    }
    
    public ResultSet executeQuery(String sql) throws SQLException {
        return statement.executeQuery(sql);
    }
    
    public ResultSet executeQuery() throws SQLException {
        return statement.executeQuery(sql);
    }
    
    public boolean execute(String sql) throws SQLException {
        return statement.execute(sql);
    }
    
    public boolean execute() throws SQLException {
        return statement.execute(sql);
    }

    public void insert(String nama, int npm) throws SQLException{
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
