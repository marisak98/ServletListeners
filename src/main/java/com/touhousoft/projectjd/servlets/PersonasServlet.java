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
    // Obtiene los valores del formulario
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String cedula = request.getParameter("cedula");
    String direccion = request.getParameter("direccion");
    String telefono = request.getParameter("telefono");
    String correo = request.getParameter("correo");
    String accion = request.getParameter("accion");

    Integer idPersona = null; // No necesitamos ID para inserciones

    // Crea una instancia de persona con los datos obtenidos
    persona personas = new persona(idPersona, nombre, apellido, cedula, direccion, telefono, correo);

    if (accion.equalsIgnoreCase("Guardar")) {
      // Llama a la función registrar de DAOpersona
      boolean estado = dao.registrar(personas);
      if (estado) {
        mensajaDB2 = "Los datos se guardaron correctamente";
      } else {
        mensajaDB2 = "Error al guardar los datos.";
      }
    } else {
      mensajaDB2 = "Acción no reconocida.";
    }
    System.out.println(personas);

    // Establece los atributos para la respuesta
    request.setAttribute("cajitadb", mensajaDB);
    request.setAttribute("confirm", mensajaDB2);
    request.setAttribute("error", mensajaDB2);

    // Redirige a la página de personas
    RequestDispatcher rd = request.getRequestDispatcher(interfazPersona);
    rd.forward(request, response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    request.setAttribute("cajitadb", mensajaDB);
    request.setAttribute("confirm", mensajaDB2);
    request.setAttribute("error", mensajaDB2);

    RequestDispatcher dispatcher = request.getRequestDispatcher(interfazPersona);
    dispatcher.forward(request, response);
  }
}
