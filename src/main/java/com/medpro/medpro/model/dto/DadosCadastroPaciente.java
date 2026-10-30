package com.medpro.medpro.model.dto;

public record DadosCadastroPaciente(
    String name,
    String email,
    String cpf,
    String telefone,
    DadosEndereco endereco
) {
    
}
