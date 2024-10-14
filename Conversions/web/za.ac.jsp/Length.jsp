<%-- 
    Document   : Length
    Created on : 02 Mar 2024, 8:21:02 PM
    Author     : Desmond
--%>

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
          String answer=(String) request.getAttribute("answer");
        %>
        <p>=<%=answer%></p>
    </body>
</html>
