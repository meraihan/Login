<%-- 
    Document   : home.jsp
    Created on : Oct 29, 2014, 5:17:53 AM
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
        <h3><%=request.getAttribute("Messages")%></h3>
    </body>
</html>
