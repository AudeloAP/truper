package com.thruper.demo.repositories;

import com.thruper.demo.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductosRepo extends JpaRepository<Productos, Integer> {

    public Optional<Productos> getProductByCodigo(String codigo);
}
