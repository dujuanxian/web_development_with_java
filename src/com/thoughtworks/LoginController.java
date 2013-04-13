package com.thoughtworks;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.toLowerCase().equals("thoughtworks") && password.equals("111")){

            RequestDispatcher dispatcher = request.getRequestDispatcher("home.html");
            dispatcher.forward(request, response);
        }
    }
}
