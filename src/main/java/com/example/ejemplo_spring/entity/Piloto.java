package com.example.ejemplo_spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "pilotos")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_piloto")
    private int id;
    private String nombre;
    private String apellido;
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_aerolinea_fk")
    private Aerolinea aerolinea;

    @ManyToMany
    @JoinTable(
          name = "vuelo_piloto",
            joinColumns = @JoinColumn(name = "id_piloto_fk"),
            inverseJoinColumns = @JoinColumn(name = "id_vuelo_fk")
    )
    private Set<Vuelo> vuelos;
}
