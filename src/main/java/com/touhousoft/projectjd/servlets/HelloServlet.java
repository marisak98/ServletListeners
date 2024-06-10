package com.touhousoft.projectjd.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * HelloServlet
 */

@WebServlet("/saludo")
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    response.getWriter().println("<h1>Hola desde Servlet Listeners!!</h1>");
  }
}
