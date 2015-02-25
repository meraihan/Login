/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raihan.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sayed Mahmud Raihan
 */
@WebServlet("/loginName")
public class connection2 extends HttpServlet {

 private final String dburl = "jdbc:mysql://localhost:3306/mylogin";
    private final String dbusr = "root";
    private final String dbpass = "";
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String firstName = request.getParameter("user");
            String password = request.getParameter("pass");
        
         Connection conn = null; // connection to the database
         String message = null;
        
        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dburl, dbusr, dbpass);
 
            // constructs SQL statement
            String sql = "INSERT INTO login (user_name, password) values (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, password);
             int row = statement.executeUpdate();
            if (row > 0) {
                message = "saved into database";
            }
            
        } catch (SQLException ex) {
            
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        
    }
    }
}
