package com.thruper.demo.controllers;

import com.thruper.demo.models.Sucursales;
import com.thruper.demo.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursales")
public class SucursalesController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping
    public ResponseEntity<Sucursales> crearSucursal(@RequestParam String nombreSucursal){

        return new ResponseEntity<>(sucursalService.crearSucursal(nombreSucursal), HttpStatus.CREATED);
    }
}
 