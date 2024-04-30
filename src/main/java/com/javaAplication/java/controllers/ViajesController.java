package com.javaAplication.java.controllers;

import javax.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javaAplication.java.models.BusesViajesInfoModel;
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


    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/pasajesDisponibles")
    public ResponseEntity <List <BusesViajesInfoModel>> searchTrips(@Valid @RequestBody DataTripsSearchDto dataTripsSearch)
    {
        System.out.println("llego el objeto al controlador");
        List <BusesViajesInfoModel> sendToServices = viajesServices.searchTripsServices(dataTripsSearch);

        // realizamos las validaciones para confirmar que el servicio nos retorno los viajes adecuadamente.
        if(sendToServices.isEmpty())
        {
            return ResponseEntity.noContent().build(); // retornamos respuesta exitosa pero vacia, (204)
        }
        else
        {
            return ResponseEntity.ok().body(sendToServices);
        }
    }

}
