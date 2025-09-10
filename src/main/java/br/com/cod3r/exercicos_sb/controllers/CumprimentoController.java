package br.com.cod3r.exercicos_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CumprimentoController {

    @GetMapping("/")
    public String cumprimento() {
        return "Olá! Spring Boot está funcionando! 🎉";
    }

    @GetMapping("/ola")
    public String ola() {
        return "Olá, mundo!";
    }
}