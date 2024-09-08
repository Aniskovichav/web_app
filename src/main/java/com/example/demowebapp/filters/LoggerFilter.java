package com.example.demowebapp.filters;

import com.example.demowebapp.model.Role;
import com.example.demowebapp.utils.ServletUtils;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

@WebFilter(filterName = "LoggerFilter" , urlPatterns = {"/*"})
public class LoggerFilter implements Filter {



    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println(new Date() + " -> Requested :" + httpServletRequest.getServletContext() + " / "
                + httpServletRequest.getServerName()
                + " / " + httpServletRequest.getServerPort() );
        System.out.println( httpServletRequest.getServletPath()
                + " / " + httpServletRequest.getRequestedSessionId() );
        chain.doFilter(request, response);
    }
}
