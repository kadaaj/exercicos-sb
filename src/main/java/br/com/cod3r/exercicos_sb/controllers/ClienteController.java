package br.com.cod3r.exercicos_sb.controllers;

import br.com.cod3r.exercicos_sb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "123.456.789-10");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id){
        return new Cliente(id, "João Augusto", "654.321.789-11");
    }
}
