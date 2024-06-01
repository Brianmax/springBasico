package com.example.ejemplo_spring.controller;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

        Aerolinea aerolineaSaved = aerolineaRepository.save(aerolinea);

        return aerolineaSaved;
    }

    @GetMapping("/find/{id}")
    public Aerolinea findById(@PathVariable int id)
    {
        // Aerolinea aerolineaFound = aerolineaRepository.findById(id).orElse(null);

        Optional<Aerolinea> optionalAerolinea = aerolineaRepository.findById(id);

        if(optionalAerolinea.isEmpty()) // devuelve verdadero en el caso de que el optional este vacion
        {
            return null;
        }
        else {
            Aerolinea aerolineaFound = optionalAerolinea.get();
            return aerolineaFound;
        }
    }
}
