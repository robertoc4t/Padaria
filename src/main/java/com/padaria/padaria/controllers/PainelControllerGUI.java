package com.padaria.padaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // Importe o GetMapping
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.padaria.padaria.DTOs.FuncionarioDTO;
import com.padaria.padaria.services.PadariaServices;

@Controller
@RestController
public class PainelControllerGUI {

    @Autowired
    private PadariaServices padariaService;


    // Exibe a página inicial de operações do funcionário
    @GetMapping("")
    public String inicio() 
    {
        return "Inicio"; 
    }

    
    // Exibe o html do painel de login do padeiro
    @GetMapping("/painel/funcionario/novo")
    public String exibirFormularioPadeiro() 
    {
        return "FormularioFuncionario"; 
    }

    
    // Exibe o "repository" dos funcionários
    @GetMapping("/painel/funcionario")
    public String exibirPainelFuncionario() 
    {
        return padariaService.listarFuncionarios();
    }


    // Processa o formulário de login do padeiro e carrega o painel de operações do funcionário
    @PostMapping("/painel/funcionario")
    public String processarFormularioPadeiro(@RequestBody FuncionarioDTO funcionario) 
    {
       padariaService.adicionarFuncionario(funcionario.nome(), funcionario.especialidade(), funcionario.anosExperiencia());
       return "PainelDeOperacoesFuncionario"; 
    }


}