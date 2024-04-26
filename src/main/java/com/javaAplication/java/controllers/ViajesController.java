package com.javaAplication.java.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaAplication.java.dto.DataTripsSearchDto;
import com.javaAplication.java.services.ViajesServices;

@RestController
@Validated
public class ViajesController 
{

    private final ViajesServices viajesServices;

    @Autowired
    public ViajesController(ViajesServices viajesServices)
    {
        this.viajesServices = viajesServices;
    }


    @PostMapping("/pasajesDisponibles")
    public ResponseEntity <String> searchTrips(@Valid @RequestBody DataTripsSearchDto dataTripsSearch)
    {
        System.out.println("llego el objeto al controlador");
        Boolean sendToServices = viajesServices.searchTripsServices(dataTripsSearch);
    }

}
