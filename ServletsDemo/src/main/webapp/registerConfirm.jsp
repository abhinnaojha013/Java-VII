<%--
  Created by IntelliJ IDEA.
  User: Abhinna
  Date: 2023-01-23
  Time: 08:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%
      out.print(request.getParameter("fullName") + ", " + request.getParameter("address") + ", " + request.getParameter("city"));

      String name = request.getParameter("fullName");
      session.setAttribute("user", name);
    %>

  </body>
</html>
