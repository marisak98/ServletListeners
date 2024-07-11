package com.touhousoft.projectjd.modelo;

import java.sql.*;

public class ConexionDB {
  private String jdbcUrl;
  private String jdbcUsername;
  private String jdbcPassword;

  private Connection jdbcConnection;

  public ConexionDB(String jdbcUrl, String jdbcUsername, String jdbcPassword) {
    this.jdbcUrl = jdbcUrl;
    this.jdbcUsername = jdbcUsername;
    this.jdbcPassword = jdbcPassword;
  }

  public void getConnection() throws SQLException {
    if (jdbcConnection == null || jdbcConnection.isClosed()) {
      try {
        Class.forName("com.mariadb.jdbc.Driver");
        System.out.println("[+] Conexion exitosa!!");
      } catch (ClassNotFoundException ex) {
        // TODO: handle exception
        System.out.println("[!] Error de Conexion.");
        throw new SQLException(ex);
      }
    }
    jdbcConnection = (Connection) DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
  }

  public void disconnect() throws SQLException {
    if (jdbcConnection != null && !jdbcConnection.isClosed()) {
      jdbcConnection.close();
    }
  }

  public Connection getDataBase() {
    return jdbcConnection;
  }
}
