package com.touhousoft.projectjd.modelo;

import java.sql.*;

public class DAOpersona {

  private ConexionDB connect;

  public DAOpersona(String jdbcUrl, String jdbcUsername, String jdbcPassword) throws SQLException {
    connect = new ConexionDB(jdbcUrl, jdbcUsername, jdbcPassword);
  }

  public ConexionDB getConectionDB() {
    return connect;
  }

  public boolean registrar(persona personas) {
    boolean estado = false;

    Statement stm;

    String query = "INSERT INTO persona VALUES (null, '" + personas.getNombre() + "', '" + personas.getApellidos()
        + "', '" + personas.getCedula() + "', '" + personas.getDireccion() + "', '" + personas.getTelefono() + "', '"
        + personas.getCorreo() + "')";

    try {
      connect.getConnection();
      stm = connect.getDataBase().createStatement();
      stm.execute(query);
      estado = true;
      stm.close();
      connect.disconnect();
    } catch (SQLException ex) {
      // TODO: handle exception
      estado = false;
      ex.printStackTrace();
    }
    return estado;

  }
}
