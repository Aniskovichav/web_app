package com.example.demowebapp;

import com.example.demowebapp.dao.UserDAO;
import com.example.demowebapp.dao.UserDAOImpl;
import com.example.demowebapp.services.CurrencySenderService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CurrenciesSenderServlet", value = "/send-currencies")
public class CurrenciesSenderServlet extends HttpServlet {
    UserDAO userDAO = new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CurrencySenderService.sendCurrencies(userDAO.findAll());
        request.setAttribute("msg", "Currencies has been send");
        ServletUtils.forwardJsp("blog", request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
