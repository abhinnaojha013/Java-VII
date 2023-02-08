<%@ page import="java.util.List" %>
<%@ page import="com.example.stlDemo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Abhinna
  Date: 2023-02-07
  Time: 08:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
      <title>Title</title>
  </head>
  <%
    List<Student> data = new ArrayList<>();

    data.add(new Student("Jack", "Sparrow", false));
    data.add(new Student("Rose", "Johnson", false));
    data.add(new Student("Harry", "Potter", true));

    pageContext.setAttribute("myStudents", data);
  %>
  <body>

  </body>
</html>
