/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement; 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.sql.*;

/**
 *
 * @author Sayed Mahmud Raihan
 */
@WebServlet("/RegConnection")
public class myconn extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNAME = request.getParameter("fname");
        String lastNAME = request.getParameter("lname");
        String email = request.getParameter("email");
        String userid = request.getParameter("usrname");
        String password = request.getParameter("pword");
        
        Connection connn = null;
        String message = null;
        PreparedStatement st = null;
        
        try{
            connn = DAOConnection.sqlconnection();
            String sql = "insert into register (first_name, last_name, email, user_id, password) VALUES (?,?,?,?,?)" ;
            st = connn.prepareStatement(sql);
            st.setString(1, firstNAME);
            st.setString(2, lastNAME);
            st.setString(3, email);
            st.setString(4, userid);
            st.setString(5, password);
            int row = st.executeUpdate();
            
            if (row > 0) {
                message = "Successfully saved into database";
            }
        }catch(SQLException ex){
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (connn != null) {
                // closes the database connection
                try {
                    connn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            request.setAttribute("Messages", message);
             
            // forwards to the message page
            getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        }
    }


}
