/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.api;

import indsql.api.IndsqlParser.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Andhika
 */
public class IndSQL {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String statement;
            
            System.out.println("Enter your statement:");
            statement = br.readLine();
            if (statement.length() == 0) {
                statement = "ambil semua dari tabel di mana a=1";
            }
            System.out.println(statement);
            
            String sql = convertToSQL(statement);
            
            System.out.println("\n" + sql);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static String convertToSQL(String statement) throws Exception {
        String sql = "";

        try {

            IndsqlParser parser = new IndsqlParser(null);
            ANTLRInputStream input = new ANTLRInputStream(statement);
            IndsqlLexer lexer = new IndsqlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens);
            RootContext root = parser.root();

            Select_statementContext select = root.select_statement();
            Update_statementContext update = root.update_statement();
            Delete_statementContext delete = root.delete_statement();
            Insert_statementContext insert = root.insert_statement();
            
            if (select != null) {
                // SELECT statement
                sql = parseSelect(select);
            }
            else if (update != null) {
                sql = parseUpdate(update);
            }
            else if (delete != null) {
                sql = parseDelete(delete);
            }
            else if (insert != null) {
                sql = parseInsert(insert);
            }
        }
        catch (Exception ex) {
            sql = "";
            
            throw ex;
        }
        finally {
            return sql;
        }
    }

    private static String parseSelect(Select_statementContext select)
            throws Exception {
        String sql = "SELECT ";

        Select_listContext select_list = select.select_list();
        if (select_list.ALL() != null || select_list.ASTERISK() != null) {
            sql += "* ";
        }
        else {
            sql += select_list.getText();
        }

        Table_specContext table_spec = select.table_spec();
        if (table_spec != null) {
            sql += " FROM " + table_spec.getText();
        }
        else {
            throw new Exception("Invalid query: No table_spec defined.");
        }

        TerminalNode where = select.WHERE();
        if (where != null) {
            // WHERE clause
            sql += " WHERE " + select.expression().getText();
        }

        return sql;
    }

    private static String parseUpdate(Update_statementContext update) {
        String sql = "UPDATE ";
        
        return sql;
    }

    private static String parseDelete(Delete_statementContext delete) {
        String sql = "DELETE FROM ";
        
        return sql;
    }

    private static String parseInsert(Insert_statementContext insert) {
        String sql = "INSERT INTO ";
        
        return sql;
    }
}
