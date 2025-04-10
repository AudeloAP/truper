package com.thruper.demo.repositories;

import com.thruper.demo.models.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepo extends JpaRepository<Ordenes, Integer> {
}
