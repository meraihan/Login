<%-- 
    Document   : register
    Created on : Oct 28, 2014, 10:41:07 AM
    Author     : Sayed Mahmud Raihan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="RegConnection"  method="post">
            First Name: <input type="text" name="fname" required><br>
            
            Last Name: <input type="text" name="lname" required><br>
            
            E-mail: <input type="text" name="email" required><br>
            
            User Name: <input type="text" name="usrname" required><br>
            
            Password: <input type="text" name="pword" required><br>
            
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
