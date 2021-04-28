package com.example.LoginPassword.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private String username;
    private String password;

    @Override
    public void init() throws ServletException {
        username = getServletContext().getInitParameter("username");
        password = getServletContext().getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String login = req.getParameter("login");
        final String pass = req.getParameter("password");
        if (login == null || pass == null) {
            resp.sendError(401);
            return;
        }
        if (!login.equals(username) || !pass.equals(password)) {
            resp.sendError(401);
            return;
        }
        final HttpSession session = req.getSession(true);
        session.setAttribute("username", login);
        resp.sendRedirect("catalogShoes");
    }
}
