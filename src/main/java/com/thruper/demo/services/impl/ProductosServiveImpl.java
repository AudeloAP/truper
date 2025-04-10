package com.thruper.demo.services.impl;

import com.thruper.demo.models.ProductDTO;
import com.thruper.demo.models.Productos;
import com.thruper.demo.repositories.ProductosRepo;
import com.thruper.demo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductosServiveImpl implements ProductoService {

    @Autowired
    private ProductosRepo productosRepo;

    @Override
    public Productos guardarProduct(ProductDTO producto) {

        Productos productToSave = new Productos();
        productToSave.setCodigo(producto.getCodigo());
        productToSave.setDescripcion(producto.getDescripcion());
        productToSave.setPrecio(producto.getPrecio());
        return productosRepo.save(productToSave);
    }

    @Override
    public Productos obtenerProductoPorCodigo(String codigo) throws RuntimeException{

        Optional<Productos> producto =  productosRepo.getProductByCodigo(codigo);

        if (producto.isEmpty())
            throw new RuntimeException("Producto no encontrado");

        return producto.get();
    }
}
