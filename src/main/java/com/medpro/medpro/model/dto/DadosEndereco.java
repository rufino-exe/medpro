package com.medpro.medpro.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
    @NotBlank String rua,
    String numero,
    @NotBlank String bairro,
    @NotBlank @Pattern(regexp = "\\d{5}-\\d{3}") String cep,
    @NotBlank String cidade,
    @NotBlank String estado,
    String complemento
) {
    
}
