package com.example.ejemplo_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secondController")
public class SecondController {

    @GetMapping("/hola")
    public String hola()
    {
        return "Hola desde el segundo controlador";
    }
}
