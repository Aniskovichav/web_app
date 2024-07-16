package com.example.demowebapp;

import com.example.demowebapp.dao.UserDAO;
import com.example.demowebapp.dao.UserDAOImpl;
import com.example.demowebapp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    private UserDAOImpl userDAO = new UserDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Login page request " + new Date());
        ServletUtils.forwardJsp("login", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String email = request.getParameter("email");
        final String pwd =request.getParameter("pwd");

        HttpSession session = request.getSession();
        if(request.getSession().getAttribute("user") != null) {
           ServletUtils.forwardJsp("blog", request, response);
            return;
        } else {
            ServletUtils.forwardJsp("login", request, response);
            return;
        }
    }
}

