package com.medpro.medpro.model.dto;

import com.medpro.medpro.enums.Especialidade;

public record DadosCadastroMedico(
    String name,
     String email,
     String crm,
     Especialidade especialidade,
     DadosEndereco endereco
) {
    
}
