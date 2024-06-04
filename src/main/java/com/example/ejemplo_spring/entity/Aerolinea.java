package com.example.ejemplo_spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "aerolineas")
@Getter
@Setter
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aerolinea")
    private int id;
    // @Column(name = "nombre")
    private String nombre;
    @JsonIgnoreProperties("aerolinea")
    @OneToMany(mappedBy = "aerolinea")
    private Set<Avion> avions;
}