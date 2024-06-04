package com.example.ejemplo_spring.service;

import com.example.ejemplo_spring.entity.Avion;

public interface AvionService {
    Avion crear(Avion avion);
    Avion buscarPorId(int id);
    Avion actualizar(Avion avion, int id);
    void eliminar(int id);
}
