package com.example.cursorestfulspringboott4.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/cliente/{codigo}")
    public String getClientes(@PathVariable int codigo){
        if(codigo > 0)
            return "cliente " + codigo;
        else
            return codigo + " = Erro, codigo negativo";
    }
}
