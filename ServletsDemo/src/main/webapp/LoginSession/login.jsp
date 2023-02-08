<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2023-01-25
  Time: 07:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <div>
<%--            <form action="loginConfirm.jsp" method="post">--%>
                <form action="/ServletsDemo_war_exploded/Servlet" method="post">
                Username:
                <input type="text" name="username"><br>
                Password:
                <input type="password" name="password"><br>
                <input type="submit" value="Login">
            </form>
        </div>
    </body>
</html>
