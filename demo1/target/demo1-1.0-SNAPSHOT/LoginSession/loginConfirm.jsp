<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %><%--
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

          Class.forName("com.mysql.jdbc.Driver");
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");

          Statement statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery("SELECT * FROM user_pass");

          boolean flag = false;
          while (resultSet.next()) {
              if (un.equalsIgnoreCase(resultSet.getString(2)) && pw.equals(resultSet.getString(3))) {
                 out.println("Valid user");
                 flag = true;
                 break;
              }
          }
          if (!flag) {
              out.println("Invalid User: " + un + "<br>");
              out.println("Invalid password: " + pw + "<br>");
              out.println("<a href = 'login.jsp'>back to login</a>");
          }

      } catch (Exception exception) {
          out.println(exception);
      }

  %>

  </body>
</html>
