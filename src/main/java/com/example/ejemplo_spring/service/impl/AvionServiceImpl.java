package com.example.ejemplo_spring.service.impl;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.dao.AvionRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import com.example.ejemplo_spring.entity.Avion;
import com.example.ejemplo_spring.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionServiceImpl implements AvionService {
    private AerolineaRepository aerolineaRepository;
    private AvionRepository avionRepository;

    public AvionServiceImpl(AvionRepository avionRepository,AerolineaRepository aerolineaRepository)
    {
        this.avionRepository = avionRepository;
        this.aerolineaRepository = aerolineaRepository;
    }
    @Override
    public Avion crear(Avion avion) {
        // verificar que el id de la aerolinea exista
        Aerolinea aerolinea = avion.getAerolinea();

        Optional<Aerolinea> aerolineaOptional = aerolineaRepository.findById(aerolinea.getId());

        if(aerolineaOptional.isPresent())
        {
            return avionRepository.save(avion);
        }
        else {
            return null;
        }
    }

    @Override
    public Avion buscarPorId(int id) {
        return null;
    }

    @Override
    public Avion actualizar(Avion avion, int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}
