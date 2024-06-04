package com.example.ejemplo_spring.dao;

import com.example.ejemplo_spring.entity.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion, Integer> {
}
