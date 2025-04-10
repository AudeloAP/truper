package com.thruper.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sucursales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sucursal_id;
    private String nombre;

    @OneToMany(mappedBy = "sucursales")
    private List<Ordenes> ordenes;

}
