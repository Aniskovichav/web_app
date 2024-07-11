package com.example.demowebapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;

import static com.example.demowebapp.utils.IOUtils.read;

@WebServlet(name = "TemplateTestServlet", value = "/template")
public class TemplateTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        File f = new File("D:\\Aniskovich\\demo-web-app\\src\\main\\webapp\\index.html");
        String indexContent = read(f);


        if (request.getParameter("user") != null) {
            indexContent = indexContent.replace("${action.link}", "logout");
            indexContent = indexContent.replace("${action.name}", "Logout");

            String user = request.getParameter("user");
            indexContent = indexContent.replace("${action.welcome}", "welcome");
            indexContent = indexContent.replace("${action.name_user}", "Welcome, dear " + user);


        } else {
            indexContent = indexContent.replace("${action.link}", "login");
            indexContent = indexContent.replace("${action.name}", "Login");

            indexContent = indexContent.replace("${action.welcome}", "welcome");
            indexContent = indexContent.replace("${action.name_user}", "Not authorized") ;
        }

        response.getWriter().println(indexContent);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
