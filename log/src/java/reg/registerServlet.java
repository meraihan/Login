/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reg;

import database.dbCon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import validation.valid;

/**
 *
 * @author lenovo
 */
public class registerServlet extends HttpServlet {
    private Connection con;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean  isRegistered=false;
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String userId=request.getParameter("userId");
        String userName=request.getParameter("userName");
        String userEmail=request.getParameter("userEmail");
        String userPassword=request.getParameter("userPassword");
        String repeatedPassword=request.getParameter("repeatedPassword");
        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
      valid val=new valid();
        
        
        try{
       
           dbCon d=new dbCon();
           Connection con=d.getConnection();
           if((val.useridValidator(userId)) &&(val.usernameValidator(userName)) && (val.passwordValidator(userPassword)) &&(val.emailValidator(userEmail))){
        if(userPassword.equals(repeatedPassword)){
           Statement st=con.createStatement();
           out.print("sdfa");
           String sql="insert into metable VALUES(NULL,?,?,?,?)";

           PreparedStatement stmt=con.prepareStatement(sql);
      
           stmt.setString(1, userId);
           stmt.setString(2, userName);
           stmt.setString(3, userPassword);
           stmt.setString(4, userEmail);
             out.print("wertuiofa");
           int i=stmt.executeUpdate();
           if(i>0){
               isRegistered=true;
           
           out.print("u r registered");
           rd.include(request, response);
           }
        }
           
           }  
       
        }
        
       catch (Exception e){
       
       out.print("sory");
       }
        
        
//        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
