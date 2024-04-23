package com.javaAplication.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaAplication.java.dto.DtoUser;
import com.javaAplication.java.services.CrudUsersServices;

@RestController
public class CrudUsersController 
{

    private final CrudUsersServices crudUsersServices;

    @Autowired
    public CrudUsersController(CrudUsersServices crudUsersServices) {
        this.crudUsersServices = crudUsersServices;
    }

    @PostMapping("/agregarUsuario")
    public ResponseEntity <String> añadirUsuario(@RequestBody DtoUser userDto) {
        System.out.println("Datos recibidos en el controlador: " + userDto);
        
        String respuestaServicio = crudUsersServices.añadirUsuarioServices(userDto);

        if(respuestaServicio.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ha ocurrido un error inesperado en el servidor");

        }
        else
        {
            return ResponseEntity.ok(respuestaServicio);

        }
        
    
    }
}
