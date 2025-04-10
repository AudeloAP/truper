package com.thruper.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ordenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orden_id;

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursales sucursal;

    @OneToMany(mappedBy = "ordenes")
    private List<Productos> productos;

    private Date fecha;

    private double total;
}
