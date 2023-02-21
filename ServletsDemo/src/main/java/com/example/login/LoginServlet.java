package com.example.login;

import com.mysql.cj.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if (user.equalsIgnoreCase("Abhinna") && pass.equals("PassAbhinna123")) {
            out.println("User: " + user);
            out.println("Password: " + pass);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
//
//            response.sendRedirect("user.jsp");

            RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginSession/user.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginSession/login.jsp");
            dispatcher.forward(request, response);
        }
    }
}
