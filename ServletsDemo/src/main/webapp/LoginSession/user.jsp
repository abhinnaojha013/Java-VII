<%--
  Created by IntelliJ IDEA.
  User: abhinna
  Date: 2023-02-21
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
    String username = session.getAttribute("user").toString();
    Cookie userCookie = new Cookie("userCookie", username);

    userCookie.setMaxAge(60 * 60 * 24 * 3);

    response.addCookie(userCookie);

    out.println("User cookie set as userCookie, value = " + username);
  %>
</body>
</html>
