package com.example.ejemplo_spring.dao;

import com.example.ejemplo_spring.entity.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer> {
}
