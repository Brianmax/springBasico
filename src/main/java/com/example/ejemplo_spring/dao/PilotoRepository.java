package com.example.ejemplo_spring.dao;

import com.example.ejemplo_spring.entity.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotoRepository extends JpaRepository<Piloto, Integer> {
}
