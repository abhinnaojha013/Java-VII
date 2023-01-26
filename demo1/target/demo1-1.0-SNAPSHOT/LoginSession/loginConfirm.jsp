<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2023-01-25
  Time: 07:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Login</title>
  </head>
  <body>
  <%
      try {
          String un = request.getParameter("username");
          String pw = request.getParameter("password");

          session.setAttribute("username", un);
          session.setAttribute("password", pw);

          if (un.equalsIgnoreCase("abhinna") && pw.equals("abhinna659")) {
              response.sendRedirect("home.jsp");
          }
          else {
              response.sendRedirect("login.jsp");
          }
      } catch (Exception exception) {
          response.sendRedirect("login.jsp");
      }

  %>

  </body>
</html>
