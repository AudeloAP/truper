package com.thruper.demo.services.impl;

import com.thruper.demo.models.Sucursales;
import com.thruper.demo.repositories.SucursalesRepo;
import com.thruper.demo.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl implements SucursalService {

    @Autowired
    private SucursalesRepo sucursalesRepo;

    @Override
    public Sucursales crearSucursal(String nombreSucursal) {
        Sucursales nuevaSucursal = new Sucursales();
        nuevaSucursal.setNombre(nombreSucursal);

        return sucursalesRepo.save(nuevaSucursal);
    }
}
