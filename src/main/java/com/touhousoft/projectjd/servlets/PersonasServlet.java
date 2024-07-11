package com.touhousoft.projectjd.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.touhousoft.projectjd.modelo.DAOpersona;
import com.touhousoft.projectjd.modelo.persona;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/conexion")
public class PersonasServlet extends HttpServlet {

  String interfazPersona = "/personas.jsp";

  DAOpersona dao;
  persona perosnas;
  String mensajaDB = "Error cuando";
  String mensajaDB2 = "test";

  public void init() throws ServletException {
    String jdbcUrl = getServletContext().getInitParameter("jdbcUrl");
    String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
    String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

    try {
      dao = new DAOpersona(jdbcUrl, jdbcUsername, jdbcPassword);
      mensajaDB = "Conexion Establecida";
    } catch (SQLException ex) {
      // TODO: handle exception
      Logger.getLogger(PersonasServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)

      throws ServletException, IOException {
    request.setAttribute("cajitadb", mensajaDB);
    RequestDispatcher rd = request.getRequestDispatcher(interfazPersona);
    rd.forward(request, response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Integer idPersona = 1;
    String nombre = "";
    String apellido = "";
    String cedula = "";
    String direccion = "";
    String telefono = "";
    String correo = "";
    String accion = "";

    persona personas = new persona(idPersona,
        nombre,
        apellido,
        cedula,
        direccion,
        telefono,
        correo);

    if (accion.equalsIgnoreCase("Guardar")) {
      mensajaDB2 = "Los datos se guardaron correctamente";
    } else {
      mensajaDB2 = "¨[-] El pendejo, mejor retirate a vender bonice y ser tu propio jefe";
    }
    request.setAttribute("cajitadb", mensajaDB);
    request.setAttribute("confirm", mensajaDB2);
    request.setAttribute("error", mensajaDB2);

    RequestDispatcher dispatcher = request.getRequestDispatcher(interfazPersona);
    dispatcher.forward(request, response);
  }
}
