package com.touhousoft.projectjd.servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * ContextDemoServlet
 */
@WebServlet("/context")
class ContextDemoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ServletContext context = getServletContext();

    String message = "Context Servlet Page";
    context.setAttribute("projectjd", message);

    String contextParameter = context.getInitParameter("adminEmail");

    request.setAttribute("adminEmail", contextParameter);

    request.getRequestDispatcher("/context.jsp").forward(request, response);

  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }

}
