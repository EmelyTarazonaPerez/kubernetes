package com.practica.kubernetes.controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class controlador {

    @GetMapping("/hello")
    public String get(){
        return "Hello work!";
    }
}
