<%-- 
    Document   : login
    Created on : Feb 9, 2015, 10:55:16 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="logincss.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login To access</h1>
        <div>
            <form method="post" action="loginServlet">
                <label>userid</label>
                <input type="text" name="userId" required=""><br>
                <label>password</label>
                 <input type="password" name="userPassword" required=""><br>
            <input type="submit" name="login" value="login">
            </form>
        </div>
    </body>
</html>
