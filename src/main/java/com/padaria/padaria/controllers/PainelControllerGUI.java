package com.padaria.padaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; // Importe o GetMapping
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.padaria.padaria.DTOs.FuncionarioDTO;
import com.padaria.padaria.entities.Funcionario;
import com.padaria.padaria.services.PadariaServices;

@Controller
@RestController
public class PainelControllerGUI {

    @Autowired
    private PadariaServices padariaService;

    
    // Exibe o html do painel de login do padeiro
    @GetMapping("/painel/funcionario/novo")
    public String exibirFormularioPadeiro() 
    {
        return "formularioPadeiro"; 
    }


    @GetMapping("/funcionarios") 
    public List<Funcionario> listarTodosFuncionarios() 
    { 
        return padariaService.listarFuncionarios();
    }

    @PostMapping(path = "/AdicionarFuncionario", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Funcionario criarFuncionario(@RequestBody FuncionarioDTO funcionarioDtO) 
    {                
        return padariaService.adicionarFuncionario(funcionarioDtO);
    }   

    @PutMapping("/AtualizarFuncionario")
    public Funcionario atualizarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) 
    {
        return padariaService.atualizarFuncionario((long) 1,funcionarioDTO);
    }

    @DeleteMapping("/DeletarFuncionario")
    public Funcionario deletarFuncionario(@RequestBody Long id)
    {
        return padariaService.deletarFuncionario(2);
    }
}