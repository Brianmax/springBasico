package com.example.ejemplo_spring.service;

import com.example.ejemplo_spring.entity.Aerolinea;

import java.util.ArrayList;
import java.util.List;

public interface AerolineaService {
    // agregar
    // actualizar
    // buscarPorId
    // eliminar
    // listar

    public Aerolinea agregar(Aerolinea aerolinea);
    public Aerolinea actualizar(Aerolinea aerolinea, int id);
    public Aerolinea buscarPorId(int id);
    public void eliminarPorId(int id);
    public ArrayList<Aerolinea> listar();
}
