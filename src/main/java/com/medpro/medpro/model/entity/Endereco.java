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
}
