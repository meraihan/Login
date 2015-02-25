<%-- 
    Document   : register
    Created on : Feb 9, 2015, 11:04:27 AM
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
        <h1>Register Yourself</h1>

<form method="post" action="registerServlet">
    <label>userid</label>
    <input type="text" name="userId" required=""><br><br>
     <label>username</label>
     <input type="text" name="userName" required=""><br> <br>
     <label>Email</label>
     <input type="email" name="userEmail" required=""><br><br>
      <label>password</label>
      <input type="password" name="userPassword" required=""><br><br>
      
       <label>Repeat password</label>
       <input type="password" name="repeatedPassword" required="" onkeyup="checkPasswordMatch()"><br><br>
       <br><br><input type="submit" value="submit" onsubmit="">
</form>
<script>
    function checkPasswordMatch() {
    var password = $("#userPassword").val();
    var confirmPassword = $("#repeatedPassword").val();

    if (password != confirmPassword)
        $("#divCheckPasswordMatch").html("Passwords do not match!");
    else
        $("#divCheckPasswordMatch").html("Passwords match.");
}
</script>
    </body>
</html>
