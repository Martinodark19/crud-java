package com.javaAplication.java.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViajesController 
{

    public ResponseEntity <String> searchTrips(@RequestBody DataTrips dataTrips)
    {
        
    }

}
