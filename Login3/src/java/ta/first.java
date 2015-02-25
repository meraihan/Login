/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ta;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sayed Mahmud Raihan
 */
@WebServlet("/First")
public class first extends HttpServlet {

 
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
            String pass = request.getParameter("passwrd");
        try  {
           if(uname.equalsIgnoreCase("admin")&& pass.equalsIgnoreCase("admin")){
               HttpSession session = request.getSession();
               session.setAttribute("user",uname);
               RequestDispatcher rd = request.getRequestDispatcher("second");
               rd.forward(request, response);
           }else{
               RequestDispatcher rd = request.getRequestDispatcher("index.html");
               rd.forward(request, response);
           }
            
        }finally{
            out.close();
        }
    }

    

}
