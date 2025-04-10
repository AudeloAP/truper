package com.thruper.demo.services.impl;

import com.thruper.demo.models.Ordenes;
import com.thruper.demo.repositories.OrdenesRepo;
import com.thruper.demo.services.OrdenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenesServiceImpl implements OrdenesService {

    @Autowired
    private OrdenesRepo ordenesRepo;

    @Override
    public Ordenes guardarOrden(Ordenes orden) {
        return ordenesRepo.save(orden);
    }
}
