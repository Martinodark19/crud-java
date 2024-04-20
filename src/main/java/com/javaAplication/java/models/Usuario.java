package com.javaAplication.java.models;

public class Usuario 
{
    private String nombre;
    private String email;
    
    public Usuario(String nombre, String email)
    {
        this.nombre = nombre;
        this.email = email;
    }

    public String getName()
    {
        return "tu nombre es " + nombre;
    }

    public String getEmail()
    {
        return "tu email es " + email;
    }
}
