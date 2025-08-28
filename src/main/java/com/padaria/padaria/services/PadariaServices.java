package com.padaria.padaria.services;

import org.springframework.stereotype.Service;

import com.padaria.padaria.DTOs.FuncionarioDTO;
import com.padaria.padaria.entities.Funcionario;
import com.padaria.padaria.repository.Estoque;
import com.padaria.padaria.repository.Funcionarios;

@Service
public class PadariaServices 
{
    
    Estoque estoque = new Estoque();
    Funcionarios funcionarios;

    public Funcionario adicionarFuncionario(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setName(funcionarioDTO.nome());
        funcionario.setExperienceYears(funcionarioDTO.anosExperiencia());
        funcionario.setSpecialty(funcionarioDTO.especialidade());
        
        return this.funcionarios.save(funcionario);

    }

}
