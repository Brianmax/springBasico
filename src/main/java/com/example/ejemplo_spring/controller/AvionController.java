package com.example.ejemplo_spring.controller;

import com.example.ejemplo_spring.entity.Avion;
import com.example.ejemplo_spring.service.AvionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/avion")
public class AvionController {
    private AvionService avionService;

    public AvionController(AvionService avionService)
    {
        this.avionService = avionService;
    }

    @PostMapping("/crear")
    public Avion create(@RequestBody Avion avion)
    {
        return avionService.crear(avion);
    }
}
