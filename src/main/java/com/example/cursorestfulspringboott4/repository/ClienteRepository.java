package com.example.cursorestfulspringboott4.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import com.example.cursorestfulspringboott4.model.Cliente;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {
    
    private List <Cliente> clientes;
    private int nextCode;
    private int delCode;

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

        nextCode = 4;
        delCode = -1;
        clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
    }

    public List<Cliente> getAllClientes(){
        return clientes;
    }

    public Optional<Cliente> getClienteByCodigo(int codigo){
        for(Cliente aux: clientes){
            if (aux.getCodigo() == codigo){
                return Optional.of(aux);
            }
        }
        return Optional.empty();
    }

    public Cliente save(Cliente cliente){
        if(delCode != -1){
            cliente.setCodigo(delCode);
            clientes.add(cliente);
            delCode = -1;
        }
        else{
            cliente.setCodigo(nextCode++);
            clientes.add(cliente);
        }
        return cliente;
    }

	public void remove(Cliente cliente) {
        delCode = cliente.getCodigo();
        clientes.remove(cliente);
    }

	public Cliente update(Cliente cliente) {
        Cliente aux = getClienteByCodigo(cliente.getCodigo()).get();
        
        if(aux != null){
            aux.setEndereco(cliente.getEndereco());
            aux.setNome(cliente.getNome());
            
        }
        return aux;
	}
}
