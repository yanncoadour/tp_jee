package com.example.tp_jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "User", value = "/user")
public class UserServlet extends HttpServlet {
    private String user;

    public void init() {
        user = "Batman!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.setAttribute("user", user);

        this.getServletContext().getRequestDispatcher("/helloUser.jsp").forward(request, response);
    }

    public void destroy() {
    }
}