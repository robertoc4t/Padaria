package com.padaria.padaria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // Importe o GetMapping
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PainelControllerGUI {

    // ESTE MÉTODO VAI MOSTRAR A PÁGINA COM O FORMULÁRIO
    @GetMapping("/painel/padeiros/novo") // Usando uma URL diferente para exibir
    public String exibirFormularioPadeiro() {
        System.out.println("Exibindo formulário de padeiro..."); // Adicione um log para ver se chega aqui

        return "FormularioPadeiro"; // Nome do arquivo HTML que contém o formulário
    }
    
    // ESTE MÉTODO VAI RECEBER OS DADOS DO FORMULÁRIO ENVIADO
    @PostMapping("/painel/padeiros") // Usando a mesma URL para o POST
    public String processarFormularioPadeiro() {
       System.out.println("Formulário recebido com sucesso!"); // Adicione um log para ver se chega aqui
       return "PainelPadeiros"; // Página de sucesso após o cadastro
    }
}