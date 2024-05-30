package com.example.ejemplo_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {

    @GetMapping("/hola")
    public String hola(){
        return "Hola desde el servidor";
    }

    @GetMapping("/adios")
    public String adios()
    {
        return "Adios desde el servidor";
    }

    // mensaje desde el controlador de mi aplicativo en spring boot
    // /info

    @GetMapping("/info")
    public String infoServer()
    {
        return "mensaje desde el controlador de mi aplicativo en spring boot";
    }
}
