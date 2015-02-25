<%-- 
    Document   : logout
    Created on : Oct 30, 2014, 1:09:55 AM
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
        <%@ page session="true"%>

User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>

<br/><br/>
<a href="test">Click here to go to test servlet</a>
    </body>
</html>
