package com.example.cursorestfulspringboott4.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.cursorestfulspringboott4.model.Cliente;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {
    
    private List <Cliente> clientes;
    
    @PostConstruct
    public void criarClientes(){
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        c1.setCodigo(1);
        c1.setNome("Eduardo");
        c1.setEndereco("Rua X, 10");
        c1.setSaldo(100);

        c2.setCodigo(2);
        c2.setNome("Maria");
        c2.setEndereco("Rua Y, 125");
        c2.setSaldo(76.66);

        c3.setCodigo(3);
        c3.setNome("Duda");
        c3.setEndereco("Rua Z, 99");
        c3.setSaldo(23.99);

        clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
    }

    public List<Cliente> getAllClientes(){
        return clientes;
    }

    public Cliente getClienteByCodigo(int codigo){
        for(Cliente aux: clientes){
            if (aux.getCodigo() == codigo){
                return aux;
            }
        }
        return null;
    }

    public Cliente save(Cliente cliente){

        cliente.setCodigo(clientes.size()+1);
        clientes.add(cliente);
        return cliente;
    }
}
