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
    private ResultSet resultSet;
    private int numAffectedRows;
    private String resultDump;
    private String sql;
    private String type;
    
    public SqlStatement() throws SQLException{
        makeStatement();
    }
    
    public SqlStatement(String sql, String type) throws SQLException {
        this.sql = sql;
        this.type = type;
        makeStatement();
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
    
    public void execute() throws SQLException {
        if ("select".equals(type)) {
            resultSet = statement.executeQuery(sql);
        }
        else {
            numAffectedRows = statement.executeUpdate(sql);
        }

        generateResultDump();
    }
    
    public void close() throws SQLException {
        statement.close();
    }
    
    public ResultSet getResultSet() {
        return resultSet;
    }
    
    public String getResultDump() {
        return resultDump;
    }

    private void generateResultDump() throws SQLException {
        resultDump = "";

        if ("select".equals(type)) {
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            for (int i = 1; i <= columnCount; ++i) {
                if (i > 1) {
                    resultDump += ",";
                }

                resultDump += rsmd.getColumnName(i);
            }
            
            int l = resultDump.length();
            resultDump += "\n";
            for (int k = 0; k < l; ++k) {
                resultDump += "=";
            }
            
            while(resultSet.next()) {
                resultDump += "\n";
                for (int j = 1; j <= columnCount; ++j) {
                    if (j > 1) {
                        resultDump += ",";
                    }

                    resultDump += resultSet.getString(j);
                }
            }
        }
        else {
            resultDump = numAffectedRows + " rows affected.";
        }
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
