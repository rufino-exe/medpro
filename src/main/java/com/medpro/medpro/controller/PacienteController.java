package com.medpro.medpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medpro.medpro.model.dto.DadosAtualizacaoPaciente;
import com.medpro.medpro.model.dto.DadosCadastroPaciente;
import com.medpro.medpro.model.dto.DadosListagemPaciente;
import com.medpro.medpro.repository.PacienteRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController 
@RequestMapping ("pacientes")
public class PacienteController {

    @Autowired 
    private PacienteRepository pacienteRepository;

    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        System.out.println(dados);
    }

    @GetMapping 
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = { "nome" }) Pageable paginacao){
        return pacienteRepository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

    @PutMapping 
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados){
        var paciente = pacienteRepository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping 
    @Transactional 
    public void excluir(@PathVariable Long id){
        var paciente = pacienteRepository.getReferenceById(id);
        paciente.excluir();
    }
}
