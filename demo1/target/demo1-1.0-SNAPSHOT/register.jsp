<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2023-01-27
  Time: 07:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Register</title>
    </head>
    <body>
        <h3>
            Register
        </h3>
        <form action="/demo1_war/" method="post">
            username:
            <input type="text" name="username"><br>
            password:
            <input type="password" name="password"><br>
            <input type="submit" value="Register">
        </form>
    </body>
</html>
