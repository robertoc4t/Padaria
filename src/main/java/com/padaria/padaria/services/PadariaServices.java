package com.padaria.padaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padaria.padaria.DTOs.FuncionarioDTO;
import com.padaria.padaria.entities.Funcionario;
import com.padaria.padaria.repository.Estoque;
import com.padaria.padaria.repository.Funcionarios;

@Service
public class PadariaServices 
{
    
    Estoque estoque = new Estoque();
    
    @Autowired
    private Funcionarios funcionariosRepository;

    public Funcionario adicionarFuncionario(FuncionarioDTO funcionarioDTO) {
    Funcionario funcionario = new Funcionario();
    
    // Agora os nomes são os mesmos e a lógica fica clara
    funcionario.setName(funcionarioDTO.name());
    funcionario.setExperienceYears(funcionarioDTO.experienceYears());
    funcionario.setSpecialty(funcionarioDTO.specialty());
    
    return this.funcionariosRepository.save(funcionario);
}



    public List<Funcionario> listarFuncionarios() {
    // Apenas retorne o resultado do findAll() diretamente!
    return funcionariosRepository.findAll();
}
}