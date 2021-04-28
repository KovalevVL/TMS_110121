package com.example.LoginPassword.loginFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebFilter(filterName = "encoding", urlPatterns = "/*")
public class EncodingFilter extends HttpFilter {
    protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("Set encoding");
        req.setCharacterEncoding(StandardCharsets.UTF_8.name());
        chain.doFilter(req, resp);
    }
}
