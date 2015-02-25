<%-- 
    Document   : login
    Created on : Nov 27, 2014, 9:27:36 PM
    Author     : Sayed Mahmud Raihan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <form action="loginServlet" method="post">
            
            UserName: <input type="text" name="user"/>
            Password: <input type="password" name="pass"/>
            
            <input type="submit" value="Login"/>
            
        </form>
    </body>
</html>
