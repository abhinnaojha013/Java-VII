<%--
  Created by IntelliJ IDEA.
  User: Abhinna
  Date: 2023-02-05
  Time: 07:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
      <%
        String lang = request.getParameter("language");

        Cookie cookie = new Cookie("languageCookie", lang);
        cookie.setMaxAge(60 * 60 * 24 * 3);

        response.addCookie(cookie);
      %>
      <div>
          <p>
              Favourite language set.
          </p>
          <a href="viewCookie.jsp">next</a>
      </div>
  </body>
</html>
