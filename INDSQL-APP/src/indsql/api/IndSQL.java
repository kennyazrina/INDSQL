/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indsql.api;

import indsql.api.IndsqlParser.*;
import indsql.app.SqlStatement;
import java.io.*;
import java.sql.SQLException;
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
            
            String sql = convertToSQL(statement).getSQL();
            
            System.out.println("\n" + sql);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static SqlStatement convertToSQL(String statement) throws InvalidQueryException, SQLException {
        String sql = "";
        String type = "";

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
                type = "select";
            }
            else if (update != null) {
                sql = parseUpdate(update);
                type = "update";
            }
            else if (delete != null) {
                sql = parseDelete(delete);
                type = "delete";
            }
            else if (insert != null) {
                sql = parseInsert(insert);
                type = "insert";
            }
        }
        catch (Exception ex) {
            sql = "";
            type = "";
            
            throw ex;
        }
        finally {
            return new SqlStatement(sql, type);
        }
    }

    private static String parseSelect(Select_statementContext select) throws InvalidQueryException {
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
            throw new InvalidQueryException();
        }

        TerminalNode where = select.WHERE();
        if (where != null) {
            // WHERE clause
            sql += " WHERE " + select.expression().getText();
        }
        
        TerminalNode GROUP = select.GROUP();
        if (GROUP != null) {
            sql += " GROUP BY " + select.select_group_by().getText();
        }
        
        TerminalNode ORDER = select.ORDER();
        if (ORDER != null) {
            sql += " ORDER BY " + select.select_order_by().getText();
        }

        return sql;
    }

    private static String parseUpdate(Update_statementContext update) throws InvalidQueryException {
        String sql = "UPDATE ";

        Table_specContext table_spec = update.table_spec();
        if (table_spec != null) {
            sql += table_spec.getText();
        }
        else {
            throw new InvalidQueryException();
        }

        Update_listContext update_list = update.update_list();
        if (update_list != null) {
            sql += " SET " + update_list.getText();
        }
        else {
            throw new InvalidQueryException();
        }
        
        TerminalNode WHERE = update.WHERE();
        if (WHERE != null) {
            sql += " WHERE " + update.expression().getText();
        }
        
        return sql;
    }

    private static String parseDelete(Delete_statementContext delete) throws InvalidQueryException {
        String sql = "DELETE FROM ";
        
        Table_specContext table_spec = delete.table_spec();
        if (table_spec != null) {
            sql += table_spec.getText();
        }
        else {
            throw new InvalidQueryException();
        }
        
        TerminalNode WHERE = delete.WHERE();
        if (WHERE != null) {
            sql += " WHERE " + delete.expression().getText();
        }
        
        return sql;
    }

    private static String parseInsert(Insert_statementContext insert) throws InvalidQueryException {
        String sql = "INSERT INTO ";
        
        Table_specContext table_spec = insert.table_spec();
        if (table_spec != null) {
            sql += table_spec.getText();
        }
        else {
            throw new InvalidQueryException();
        }
        
        Insert_field_listContext insert_field_list = insert.insert_field_list();
        if (insert_field_list != null) {
            sql += " " + insert_field_list.getText();
        }
        else {
            throw new InvalidQueryException();
        }
        
        Insert_listContext insert_list = insert.insert_list();
        if (insert_list != null) {
            sql += " ROWS " + insert_list.getText();
        }
        else {
            throw new InvalidQueryException();
        }
        
        return sql;
    }
    
    public static class InvalidQueryException extends Exception {
        
    }
}
