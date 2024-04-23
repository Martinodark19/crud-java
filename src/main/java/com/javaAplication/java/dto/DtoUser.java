package com.javaAplication.java.dto;

public class DtoUser {
    private String nombre;
    private String apellido;
    private String apodo;

    public DtoUser(String nombre, String apellido, String apodo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
}