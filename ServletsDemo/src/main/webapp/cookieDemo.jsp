<%--
  Created by IntelliJ IDEA.
  User: Abhinna
  Date: 2023-02-05
  Time: 07:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form method="post" action="cookieAdd.jsp">
            Favourite Language:
            <select name="language">
                <option value="English">English</option>
                <option value="French">French</option>
                <option value="German">German</option>
                <option value="Spanish">Spanish</option>
                <option value="Dutch">Dutch</option>
                <option value="Italian">Italian</option>
            </select>
            <br>
            <input type="submit" value="choose">
        </form>
    </body>
</html>
