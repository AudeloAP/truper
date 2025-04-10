package com.thruper.demo.repositories;

import com.thruper.demo.models.Sucursales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalesRepo extends JpaRepository<Sucursales, Integer> {
}
