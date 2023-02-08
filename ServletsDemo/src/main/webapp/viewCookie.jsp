<%--
  Created by IntelliJ IDEA.
  User: Abhinna
  Date: 2023-02-05
  Time: 07:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <div>
      <%
        String language = "English";
        Cookie[] cookies = request.getCookies();

        if(cookies != null) {
          for (Cookie tempCookie:cookies) {
            if("languageCookie".equals(tempCookie.getName())) {
              language = tempCookie.getValue();
              break;
            }
          }
        }
      %>
      <p>
        Your favourite language is : <%= language %>.
      </p>
    </div>
  </body>
</html>
