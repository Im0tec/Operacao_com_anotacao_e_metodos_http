package com.example.cursorestfulspringboott4.model;

import java.util.ArrayList;

public class Cliente {
    
    private int codigo;
    private String nome;
    private String endereco;
    private double saldo;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean addPedido(Pedido pedido) {
        return pedidos.add(pedido);
    }

    public boolean removePedido(Pedido pedido) {
        return pedidos.remove(pedido);
    }

    public double somaTotalPedidos() {
        double soma = 0;

        for (Pedido pedido : pedidos) {
            soma += pedido.totalPedido();
        }

        return soma;
    }

    public double somaTotalPedidosFechados() {
        double soma = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.isPedidoFechado()) {
                soma += pedido.totalPedido();
            }
        }

        return soma;
    }

}
