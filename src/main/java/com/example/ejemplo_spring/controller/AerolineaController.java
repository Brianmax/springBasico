package com.example.ejemplo_spring.controller;

import com.example.ejemplo_spring.dao.AerolineaRepository;
import com.example.ejemplo_spring.entity.Aerolinea;
import com.example.ejemplo_spring.service.AerolineaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/aerolinea")
public class AerolineaController {
    private AerolineaRepository aerolineaRepository;
    private AerolineaService aerolineaService;

    public AerolineaController(AerolineaRepository aerolineaRepository, AerolineaService aerolineaService)
    {
        this.aerolineaRepository = aerolineaRepository;
        this.aerolineaService=aerolineaService;
    }
    @PostMapping("/crear")
    public Aerolinea aerolineaCrear(@RequestBody Aerolinea aerolinea)
    {
        // creando la aerolinea
        System.out.println("Ingresamos al endpoint");

        //Aerolinea aerolineaSaved = aerolineaRepository.save(aerolinea);

        //return aerolineaSaved;

        Aerolinea aerolinea1 = aerolineaService.agregar(aerolinea);
        return aerolinea1;
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
