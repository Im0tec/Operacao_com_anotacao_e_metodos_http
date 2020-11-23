package com.example.cursorestfulspringboott4.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class ClienteDTO {

    @NotBlank(message = "Nome e´ obrigatorio!")
    @Length(min=4, max=40, message = "Nome deve ter minimo de 4 e maximo de 40 caracteres!")
    private String nome;

    @NotBlank(message = "Endereco e´ obrigatorio!")
    @Length(min=4, max=40, message = "Endereco deve ter minimo de 4 e maximo de 40 caracteres!")
    private String endereco;

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
}
