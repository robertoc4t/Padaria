package com.padaria.padaria.services;

import org.springframework.stereotype.Service;

import com.padaria.padaria.entities.Funcionario;
import com.padaria.padaria.repository.Estoque;
import com.padaria.padaria.repository.Funcionarios;

@Service
public class PadariaServices 
{
    
    Estoque estoque = new Estoque();
    Funcionarios funcionarios = new Funcionarios();

    public void adicionarFuncionario(String name, String specialty, int experienceYears)
    {
        Funcionario funcionario = new Funcionario(name, specialty, experienceYears);
        funcionarios.addFuncionario(funcionario);
        System.out.println("Adicionando padeiro...");
    }
    
}
