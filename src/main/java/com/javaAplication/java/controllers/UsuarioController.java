package com.javaAplication.java.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaAplication.java.models.Usuario;

@RestController


public class UsuarioController 
{
    @GetMapping("/saludo")
    @ResponseBody
    public Usuario mostrarUsuario(Model model)
    {
        Usuario usuario = new Usuario("martin", "martin.villalobos1906@gmail.com");
     
        return usuario;
    }
}
