<%-- 
    Document   : mail
    Created on : Feb 9, 2015, 8:58:11 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(session.getAttribute("user")==null){
        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
    out.print("login First");
        
        rd.include(request, response);
       
        
    }
        else
            
        %>
        <h1>Insert Your E-mail</h1>
        <h2>a mail will be sent in your E-mail</h2>
        <form method="post" action="mailServlet">
            <input type="email" name="recoveryEmail" required="">
            <input type="submit" value="send mail">
           
        </form>
    </body>
</html>
