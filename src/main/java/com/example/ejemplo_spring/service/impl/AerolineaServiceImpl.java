package com.example.ejemplo_spring.service.impl;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import com.example.ejemplo_spring.service.AerolineaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
// bean
public class AerolineaServiceImpl implements AerolineaService {
    private AerolineaRepository aerolineaRepository;
    public AerolineaServiceImpl(AerolineaRepository aerolineaRepository){
        this.aerolineaRepository = aerolineaRepository;
    }
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
        // buscar por id

        Optional<Aerolinea> aerolineaOptional = aerolineaRepository.findById(id);

        if(aerolineaOptional.isPresent())
        {
            return aerolineaOptional.get();
        }
        else {
            return null;
        }
    }

    @Override
    public void eliminarPorId(int id) {

    }

    @Override
    public ArrayList<Aerolinea> listar() {
        return null;
    }
}
