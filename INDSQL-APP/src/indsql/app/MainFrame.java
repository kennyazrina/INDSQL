/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package indsql.app;

import indsql.api.IndSQL;
import indsql.api.IndSQL.InvalidQueryException;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Nurul Fithria
 */
public class MainFrame extends JFrame {
    public static JButton button;
    public static JTextArea result;
    public static JTextArea query;

    public MainFrame(String title) {
        super(title);
        
        //layout component
        setLayout(new BorderLayout());
        
        //create swing component

        query = new JTextArea();
        query.setPreferredSize(new Dimension (200,200));
        result = new JTextArea();
        result.setPreferredSize(new Dimension (200,200));
        
        button = new JButton("Execute!");
        
        //add swing component to content pane
        Container c = getContentPane();
       
        c.add(query, BorderLayout.WEST);
        c.add(result, BorderLayout.EAST);
        c.add(button, BorderLayout.PAGE_END);
        
        //add behaviour
        query.append("query");
        result.append("result");
        button.addActionListener( new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String statement = MainFrame.query.getText();
                    SqlStatement sql = IndSQL.convertToSQL(statement);
                    sql.execute();
                    MainFrame.result.setText(sql.getSQL() + "\n\n" + sql.getResultDump());
                } catch (InvalidQueryException ex) {
                    MainFrame.result.setText("Invalid query");
                } catch (SQLException ex) {
                    MainFrame.result.setText("SQLException caught:\n" + ex.getMessage());
                }
            }
        });
    }
}
