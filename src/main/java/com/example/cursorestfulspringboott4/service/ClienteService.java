package com.example.cursorestfulspringboott4.service;

import com.example.cursorestfulspringboott4.dto.ClienteDTO;
import com.example.cursorestfulspringboott4.model.Cliente;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public Cliente fromDTO(ClienteDTO dto){
        Cliente cliente = new Cliente();
        cliente.setEndereco(dto.getEndereco());
        cliente.setNome(dto.getNome());

        return cliente;
    }
}
