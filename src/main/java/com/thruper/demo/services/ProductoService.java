package com.thruper.demo.services;

import com.thruper.demo.models.Productos;
import com.thruper.demo.repositories.ProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ProductoService {
    public Productos guardarProduct(Productos producto);

    public Productos obtenerProductoPorCodigo(String codigo) throws RuntimeException;
}
