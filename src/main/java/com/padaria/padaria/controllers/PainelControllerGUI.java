package com.padaria.padaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // Importe o GetMapping
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.padaria.padaria.services.PadariaServices;

@Controller
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
    
    // Processa o formulário de login do padeiro e carrega o painel de operações do funcionário
    @PostMapping("/painel/funcionario")
    public String processarFormularioPadeiro(@RequestBody String nome, String especialidade, int anosExperiencia) 
    {
       padariaService.adicionarFuncionario(nome, especialidade, anosExperiencia);
       return "PainelDeOperacoesFuncionario"; 
    }
}