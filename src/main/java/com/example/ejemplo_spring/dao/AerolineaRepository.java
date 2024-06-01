package com.example.ejemplo_spring.dao;

import com.example.ejemplo_spring.entity.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer> {
    boolean existsByNombre(String nombre);
}