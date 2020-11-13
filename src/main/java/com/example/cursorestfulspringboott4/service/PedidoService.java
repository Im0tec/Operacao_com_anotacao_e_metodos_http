package com.example.cursorestfulspringboott4.service;

import com.example.cursorestfulspringboott4.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repositorio;

}
