package com.example.demowebapp;

import com.example.demowebapp.dao.OfficeDao;
import com.example.demowebapp.entity.Office;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/offices")
public class OfficeServlet extends HttpServlet {
    private OfficeDao officeDao = new OfficeDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Office> offices = officeDao.getAllOffices();
        request.setAttribute("offices", offices);
        request.getRequestDispatcher("offices.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("create".equals(action)) {
            Office office = new Office();
            office.setOfficeCode(request.getParameter("officeCode"));
            office.setCity(request.getParameter("city"));
            office.setPhone(request.getParameter("phone"));
            office.setAddressLine1(request.getParameter("addressLine1"));
            office.setAddressLine2(request.getParameter("addressLine2"));
            office.setState(request.getParameter("state"));
            office.setCountry(request.getParameter("country"));
            office.setPostalCode(request.getParameter("postalCode"));
            office.setTerritory(request.getParameter("territory"));
            officeDao.saveOffice(office);
        } else if ("update".equals(action)) {
            String officeCode = request.getParameter("officeCode");
            Office office = officeDao.getOfficeById(officeCode);
            if (office != null) {
                office.setCity(request.getParameter("city"));
                office.setPhone(request.getParameter("phone"));
                office.setAddressLine1(request.getParameter("addressLine1"));
                office.setAddressLine2(request.getParameter("addressLine2"));
                office.setState(request.getParameter("state"));
                office.setCountry(request.getParameter("country"));
                office.setPostalCode(request.getParameter("postalCode"));
                office.setTerritory(request.getParameter("territory"));
                officeDao.updateOffice(office);
            }
        } else if ("delete".equals(action)) {
            String officeCode = request.getParameter("officeCode");
            officeDao.deleteOffice(officeCode);
        }
        response.sendRedirect("offices");
    }
}
