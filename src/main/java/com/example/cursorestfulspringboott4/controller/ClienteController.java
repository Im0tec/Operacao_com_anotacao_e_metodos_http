package com.example.cursorestfulspringboott4.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClienteController {
    
    List <Cliente> clientes = new ArrayList<Cliente>();
    
    @PostConstruct
    public void criarClientes(){
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        c1.codigo = 1;
        c1.nome = "Eduardo";
        c1.endereco = "Rua X, 10";
        c1.saldo = 100;

        c2.codigo = 2;
        c2.nome = "Maria";
        c2.endereco = "Rua Y, 125";
        c2.saldo = 76.66;

        c3.codigo = 3;
        c3.nome = "Duda";
        c3.endereco = "Rua Z, 99";
        c3.saldo = 23.99;

        clientes =  Arrays.asList(c1,c2,c3);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clientes;
    }


    @GetMapping("/clientes/{codigo}")
    public Cliente getClientes(@PathVariable int codigo){
        Cliente cli = null;

        /*for(int i=0; i<clientes.size();i++){
            Cliente aux = clientes.get(i);
            if(aux.codigo == codigo){
                cli =  aux;
                break;
            }

        }(Old for)*/

        for(Cliente aux: clientes){
            if(aux.codigo == codigo){
                cli = aux;
                break;
            }
        }
        return cli;
    }
}
