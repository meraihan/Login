<%-- 
    Document   : index.jsp
    Created on : Oct 28, 2014, 10:38:27 AM
    Author     : Sayed Mahmud Raihan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="loginServlet" method="post">
            User Name: <input type="text" name="usr" required><br>
            
            Password: <input type="password" name="pass" required><br>
            
            <input type="submit" value="Login"><br>
            Not register: <a href="register.jsp">Register here</a>
            
        </form>
    </body>
</html>
