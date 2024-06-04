package com.example.ejemplo_spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "aviones")
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avion")
    private int id;
    private int capacidad;
    private int peso;
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "id_aerolinea_fk")
    private Aerolinea aerolinea;
}
