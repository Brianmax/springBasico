package com.example.ejemplo_spring.controller;

import com.example.ejemplo_spring.entity.Piloto;
import com.example.ejemplo_spring.service.PilotoService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/piloto")
public class PilotoController {
    private PilotoService pilotoService;

    public PilotoController(PilotoService pilotoService) {
        this.pilotoService = pilotoService;
    }

    @PostMapping("/crear")
    public Piloto crear(@RequestBody Piloto piloto)
    {
        return pilotoService.create(piloto);
    }
    @GetMapping("/find/{id}")
    public Piloto findById(@PathVariable int id)
    {
        return pilotoService.findById(id);
    }
}
