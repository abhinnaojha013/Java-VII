<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2023-01-25
  Time: 07:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Home</title>
  </head>
  <body>
        <%
            if (session.getAttribute("username") != null) {
                out.println("Hello " + session.getAttribute("username"));
            } else {
                response.sendRedirect("login.jsp");
            }
        %>
  </body>
</html>
