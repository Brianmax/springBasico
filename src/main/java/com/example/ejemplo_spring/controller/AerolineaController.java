package com.example.ejemplo_spring.controller;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/aerolinea")
public class AerolineaController {
    private AerolineaRepository aerolineaRepository;

    public AerolineaController(AerolineaRepository aerolineaRepository)
    {
        this.aerolineaRepository = aerolineaRepository;
    }
    @PostMapping("/crear")
    public Aerolinea aerolineaCrear(@RequestBody Aerolinea aerolinea)
    {
        // creando la aerolinea
        System.out.println("Ingresamos al endpoint");
        return aerolineaRepository.save(aerolinea);
    }
}
