package com.example.ejemplo_spring.service.impl;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import com.example.ejemplo_spring.service.AerolineaService;

import java.util.ArrayList;
import java.util.List;

public class AerolineaServiceImpl implements AerolineaService {
    private AerolineaRepository aerolineaRepository;
    @Override
    public Aerolinea agregar(Aerolinea aerolinea) {
        // verificar que no se repita el nombre
        // antes de enviar al repository

        if(aerolineaRepository.existsByNombre(aerolinea.getNombre()))
        {
            return null;
        }
        else {
            return aerolineaRepository.save(aerolinea);
        }
    }

    @Override
    public Aerolinea actualizar(Aerolinea aerolinea, int id) {
        return null;
    }

    @Override
    public Aerolinea buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminarPorId(int id) {

    }

    @Override
    public ArrayList<Aerolinea> listar() {
        return null;
    }
}
