/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raihan.org;

import Service.AuthenticateService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sayed Mahmud Raihan
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userName = request.getParameter("user");
        String password = request.getParameter("pass");
        
        java.sql.Connection connn = null;
       
        
        
        
        if(userName!=null && userName==null || password !=null && password==""){
            
            try{
            connn = Connection.sqlconnection();
            String sql = "select * from login_details where UserName='"+userName+"', PassWord='"+password+"' limit 1";
            PreparedStatement st =  connn.prepareStatement(sql);
            ResultSet rs  = st.executeQuery(sql);
            
            while(rs.next()){
                response.sendRedirect("success.jsp");
            }
        }catch(SQLException ex){
          ex.printStackTrace();
      
      }
            
            }
        
    }
}
 