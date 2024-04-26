package com.javaAplication.java.services;

import org.springframework.stereotype.Service;

import com.javaAplication.java.dto.DtoUser;
import com.javaAplication.java.repositories.CrudUsersRepositories;
import com.javaAplication.java.models.UserModel;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CrudUsersServices {
    private CrudUsersRepositories crudUsersRepositories;

    public CrudUsersServices(CrudUsersRepositories crudUsersRepositories) {
        this.crudUsersRepositories = crudUsersRepositories;
    }

    public String añadirUsuarioServices(DtoUser userDto) {
        System.out.println("Datos recibidos en el servicio: " + userDto);

        UserModel userModel = new UserModel();
        
        userModel.setNombre(userDto.getNombre());
        userModel.setApellido(userDto.getApellido());
        userModel.setApodo(userDto.getApodo());

        crudUsersRepositories.save(userModel);

        return "Usuario agregado exitosamente";
    }
}
