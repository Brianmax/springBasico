package com.example.ejemplo_spring.service.impl;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.dao.PilotoRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import com.example.ejemplo_spring.entity.Piloto;
import com.example.ejemplo_spring.service.PilotoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PilotoServiceImpl implements PilotoService {
    private AerolineaRepository aerolineaRepository;
    private PilotoRepository pilotoRepository;

    public PilotoServiceImpl(AerolineaRepository aerolineaRepository, PilotoRepository pilotoRepository) {
        this.aerolineaRepository = aerolineaRepository;
        this.pilotoRepository = pilotoRepository;
    }

    @Override
    public Piloto create(Piloto piloto) {
        int idAerolinea = piloto.getAerolinea().getId();

        if(aerolineaRepository.existsById(idAerolinea))
        {
            return pilotoRepository.save(piloto);
        }
        else {
            return null;
        }
    }

    @Override
    public Piloto findById(int id) {
        Optional<Piloto> pilotoOptional = pilotoRepository.findById(id);
        if(pilotoOptional.isPresent())
        {
            return pilotoOptional.get();
        }
        else {
            return null;
        }
    }

    @Override
    public Piloto update(Piloto piloto, int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
