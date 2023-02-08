<%--
  Created by IntelliJ IDEA.
  User: Abhinna
  Date: 2023-02-07
  Time: 08:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <%
        String[] cities = {"Mumbai", "Singapore", "Philadelphia"};

        pageContext.setAttribute("myCities", cities);
    %>
    <body>
        <c:forEach var="tempCity" items="$(myCities)">
            $(tempCity) <br>
        </c:forEach>
    </body>
</html>
