<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <h1>
            <%= "Hello World!" %>
        </h1>
        <p>
            The server time is: <%= new java.util.Date()%>.
        </p>
        <br/>
        <a href="hello-servlet">Hello Servlet</a>

        <form method="post" action="registerConfirm.jsp">
            Full name:
            <input type="text" name="fullName">

            Address:
            <input type="text" name="address">

            City:
            <select name="city">
                <option value="Kathmandu">Kathmandu</option>
                <option value="Bhaktapur">Bhaktapur</option>
                <option value="Lalitpur">Lalitpur</option>
            </select>

            <input type="submit" value="submit">
        </form>
    <a href="todoListSessionDemo.jsp">hi</a>
    </body>
</html>