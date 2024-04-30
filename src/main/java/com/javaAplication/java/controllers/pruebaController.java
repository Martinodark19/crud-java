package com.javaAplication.java.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.javaAplication.java.dto.pruebaDto;

public class pruebaController 
{
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/pruebaController")
    public ResponseEntity<String> obtenerDesdeFrontEnd(@Valid @RequestBody pruebaDto pruebadto) {
        System.out.println("llego al controlador el mensaje");

        String mensaje = pruebadto.getMensaje();
        if (pruebadto.getMensaje().isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok().body(mensaje);
        }
    }
}
