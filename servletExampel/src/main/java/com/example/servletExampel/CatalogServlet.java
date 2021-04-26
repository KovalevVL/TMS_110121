package com.example.servletExampel;

import com.example.servletExampel.repository.ShoesReposotory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "catalog", urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("shoes", Arrays.asList("sneakers", "slippers", "oxford", "chelsea", "loafers"));
        request.getRequestDispatcher("WEB-INF/catalog.jsp").forward(request,response);
    }
}
