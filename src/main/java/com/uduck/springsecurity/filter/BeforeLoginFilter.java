package com.uduck.springsecurity.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class BeforeLoginFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String addr = servletRequest.getRemoteAddr();
        System.out.println("******************************* BeforeLoginFilter: " + addr);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
