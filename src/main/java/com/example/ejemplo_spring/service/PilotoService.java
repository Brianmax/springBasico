package com.example.ejemplo_spring.service;

import com.example.ejemplo_spring.entity.Piloto;

public interface PilotoService {
    Piloto create(Piloto piloto);
    Piloto findById(int id);
    Piloto update(Piloto piloto, int id);
    void delete(int id);
}
