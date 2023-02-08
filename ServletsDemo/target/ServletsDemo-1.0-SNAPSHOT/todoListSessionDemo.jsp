<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
Created by IntelliJ IDEA.
User: Abhinna
Date: 2023-01-24
Time: 07:41
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <title>TODO LIST</title>
  </head>
  <body>
    <form action="todoListSessionDemo.jsp" method="post">
      <p>
        Add new item to TODO list:
      </p>
      <input type="text" name="item" required>
      <input type="submit" value="Add">
    </form>

    <div>
      <%
        List<String> items = (List<String>) session.getAttribute("todoList");

        if(items == null) {
          items = new ArrayList<String>();
          session.setAttribute("todoList", items);
        }

        String item = request.getParameter("item");
        if (item != null) {
          items.add(item);
        }
      %>
    </div>

    <hr>

    <div>
      <h3>
        TODO items:
      </h3>
      <ol>
        <%
          for (String temp : items) {
            out.println("<li>" + temp + "</li>");
          }
        %>
      </ol>
    </div>
  </body>
</html>
