package com.myapp.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by User on 03.08.2016.
 */
//@WebFilter
public class filterRequest implements javax.servlet.Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String url = ((HttpServletRequest)request).getRequestURL().toString();
        String queryString = ((HttpServletRequest)request).getQueryString();
        System.out.println(url+"---"+queryString);
        //String variable = ((HttpServletRequest)request).getServletPath();
        Enumeration<String> list = request.getAttributeNames();
        HttpSession session = ((HttpServletRequest)request).getSession();
        while(list.hasMoreElements()){
            System.out.println(list.nextElement());
        }

        request.getParameterMap().forEach((k,v)-> System.out.println(k+"---"+v.toString()));
//        System.out.println(request.getParameterMap().toString());
        if(url.toUpperCase().contains("SELECT")) {
            ((HttpServletResponse)response).sendRedirect("/errorpage");
        }
        else if (session.isNew() && url.toUpperCase().contains("/WELCOME")){
            System.out.println("New SESSION");
            ((HttpServletResponse)response).sendRedirect("/welcome");
        }
        else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}

