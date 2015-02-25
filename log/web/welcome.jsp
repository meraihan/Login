

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
<%
RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
    
    if(session.getAttribute("userName")==null){

rd.forward(request, response);
}
    else
        if((session.getAttribute("userName")==null)||(session.getAttribute("userName")=="")){
        out.print("you are not logged in");
        rd.include(request, response);
        
      
        }
        else
        if(session.isNew())
        {%>
        Welcome:<%
            out.print(session.getAttribute("userName"));
            
        }
    else
            %>
            Welcome Back:<%
            out.print(session.getAttribute("userName"));
    %>        

    <button><a href="logOutServlet">logOut</a></button>
    </body>
</html>
