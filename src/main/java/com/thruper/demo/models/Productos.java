package com.thruper.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int producto_id;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Ordenes orden;

    private String codigo;

    private String descripcion;

    private double precio;
}
