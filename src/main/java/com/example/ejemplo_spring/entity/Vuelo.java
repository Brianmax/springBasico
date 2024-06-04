package com.example.ejemplo_spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import java.util.Date;

@Entity
@Table(name = "vuelos")
@Getter
@Setter
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")
    private int id;
    @Column(name = "fecha_salida")
    private Date fechaSalida;
    @Column(name = "fecha_llegada")
    private Date fechaLlegada;
    private String origen;
    private String destino;

    @ManyToOne
    @JoinColumn(name = "id_avion_fk")
    private Avion avion;
}
