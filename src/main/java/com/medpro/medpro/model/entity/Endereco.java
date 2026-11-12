package com.medpro.medpro.model.entity;

import com.medpro.medpro.model.dto.DadosEndereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable 
@Getter 
@NoArgsConstructor 
@AllArgsConstructor 
public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String numero;
    private String complemento;
    
    public Endereco(DadosEndereco dados) {
        this.rua = dados.rua();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.rua() != null) {
            if(dados.rua().isBlank())
                throw new IllegalArgumentException("Rua não pode estar em branco");
            this.rua = dados.rua();
        }
        if (dados.bairro() != null) {
            if(dados.bairro().isBlank())
                throw new IllegalArgumentException("Bairro não pode estar em branco");
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null) {
            if(dados.cep().isBlank())
                throw new IllegalArgumentException("CEP não pode estar em branco");
            this.cep = dados.cep();
        }
        if (dados.cidade() != null) {
            if(dados.cidade().isBlank())
                throw new IllegalArgumentException("Cidade não pode estar em branco");
            this.cidade = dados.cidade();
        }
        if (dados.estado() != null) {
            if(dados.estado().isBlank())
                throw new IllegalArgumentException("Estado não pode estar em branco");
            this.estado = dados.estado();
        }
        if (dados.numero() != null) {
            this.numero = dados.numero();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
    }
}
