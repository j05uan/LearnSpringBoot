package com.app.j3.app_j3.models;

public class User {
    private int cedula;
    private String nombre;
    private String apellido;
    private String email;
    //Constructor de clase
    
    public User(String nombre, String apellido, int cedula) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    }
    public User() {
    }
    
    public String getNombre() {
    return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
    return apellido;
    }
    public void setApellido(String apellido) {
    this.apellido = apellido;
    }
    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
