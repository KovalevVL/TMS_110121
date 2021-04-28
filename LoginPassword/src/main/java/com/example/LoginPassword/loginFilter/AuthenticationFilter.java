package com.example.LoginPassword.loginFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "auth", urlPatterns = {"/admin,/shoesAdd,/shoesDel,/changePrice"})
public class AuthenticationFilter extends HttpFilter {

    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session == null) {
            resp.sendError(401);
            return;
        }
        final String username = (String) session.getAttribute("username");
        if (username == null || !username.equals(getServletContext().getInitParameter("username"))) {
            resp.sendError(401);
            return;
        }
        chain.doFilter(req, resp);
    }
}
