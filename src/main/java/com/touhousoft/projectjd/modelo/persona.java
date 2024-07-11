package com.touhousoft.projectjd.modelo;

public class persona {
  private Integer idPersona;
  private String nombre;
  private String apellidos;
  private String cedula;
  private String direccion;
  private String telefono;
  private String correo;

  public persona(Integer idPersona, String nombre, String apellidos, String cedula, String direccion, String telefono,
      String correo) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.cedula = cedula;
    this.direccion = direccion;
    this.telefono = telefono;
    this.correo = correo;
  }

  public void setIdPersona(Integer idPersona) {
    this.idPersona = idPersona;
  }

  public Integer getIdPersona() {
    return idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  @Override
  public String toString() {
    return "persona{" + "idPersona=" + idPersona + ", nombres=" + nombre + ", apellidos=" + apellidos + ", cedula="
        + cedula + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + '}';
  }

}
