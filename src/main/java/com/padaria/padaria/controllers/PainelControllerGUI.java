package com.padaria.padaria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // Importe o GetMapping
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PainelControllerGUI {

    // Exibe o html do painel de login do padeiro
    @GetMapping("/painel/padeiros/novo")
    public String exibirFormularioPadeiro() 
    {
        System.out.println("Exibindo formulário de padeiro...");

        return "FormularioPadeiro";
    }
    
    // Processa o formulário de login do padeiro
    @PostMapping("/painel/padeiros")
    public String processarFormularioPadeiro() 
    {
       System.out.println("Formulário recebido com sucesso!");
       return "PainelPadeiros"; 
    }
}