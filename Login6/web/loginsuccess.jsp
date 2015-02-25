<%-- 
    Document   : loginsuccess.jsp
    Created on : Oct 29, 2014, 10:08:18 AM
    Author     : Sayed Mahmud Raihan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Successfull.............</h1>
        Welcome  <%= request.getParameter("user") %>
        Logout <a href="login.jsp"/>
    </body>
</html>
