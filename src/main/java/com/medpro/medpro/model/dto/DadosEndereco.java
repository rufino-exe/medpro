package com.medpro.medpro.model.dto;

public record DadosEndereco(
    String street,
    String numero,
    String bairro,
    String cep,
    String city,
    String state,
    String complement
) {
    
}
