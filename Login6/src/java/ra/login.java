/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ra;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sayed Mahmud Raihan
 */
@WebServlet("/loginServlet")
public class login extends HttpServlet {
    
   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String user = request.getParameter("usr");
        String pwd = request.getParameter("pass");
        
        Connection connn = null;
        String message = null;
        Statement st = null;
        ResultSet rs =null;
        
        String authentication_status;
      try{
          connn = DAOConnection.sqlconnection();
          String sql = "select password from register where user_id='" + user + "'";
          st = connn.createStatement();
          rs = st.executeQuery(sql);
          while (rs != null && rs.next()) {
              
              String db_password = rs.getString(1);
                if (db_password.equals(pwd)) {
                    System.out.println("The password matches");
                    authentication_status = "true";
                    //check if admin
                    response.sendRedirect("login.jsp");
                    
                } else {
                    
                    authentication_status = "true";
                    response.sendRedirect("logout.jsp");
                }
          }
      
      }catch(SQLException ex){
          ex.printStackTrace();
      
      }
        
        
    }


}
