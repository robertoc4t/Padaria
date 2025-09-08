package com.padaria.padaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.MessageDigest;
import com.padaria.padaria.DTOs.FuncionarioDTO;
import com.padaria.padaria.entities.Funcionario;
import com.padaria.padaria.exceptions.FuncionarioNaoEcontradoException;
import com.padaria.padaria.repository.Funcionarios;

@Service
public class PadariaServices 
{
    

    @Autowired
    private Funcionarios funcionariosRepository;

    public Funcionario adicionarFuncionario(FuncionarioDTO funcionarioDTO) 
    {
    Funcionario funcionario = new Funcionario();
    funcionario.setName(funcionarioDTO.getName());
    funcionario.setExperienceYears(funcionarioDTO.getExperienceYears());
    funcionario.setSpecialty(funcionarioDTO.getSpecialty());
    this.funcionariosRepository.save(funcionario);
    return funcionario;
    }

    public List<Funcionario> listarFuncionarios() 
    {
    return funcionariosRepository.findAll();
    }

    public Funcionario atualizarFuncionario(Long id, FuncionarioDTO funcionarioDTO) throws FuncionarioNaoEcontradoException 
    {
        Funcionario funcionarioExistente = funcionariosRepository.findById(id)
        .orElseThrow(() -> new FuncionarioNaoEcontradoException("Funcionário não encontrado"));
            funcionarioExistente.setName(funcionarioDTO.getName());
            funcionarioExistente.setExperienceYears(funcionarioDTO.getExperienceYears());
            funcionarioExistente.setSpecialty(funcionarioDTO.getSpecialty());

            this.funcionariosRepository.save(funcionarioExistente);
            return funcionarioExistente;
    }

    public Funcionario deletarFuncionario(long id) throws FuncionarioNaoEcontradoException
    {
        Funcionario funcionarioDemitido = funcionariosRepository.findById(id)
        .orElseThrow(() -> new FuncionarioNaoEcontradoException("Funcionario não encontrado para apagar"));
        this.funcionariosRepository.delete(funcionarioDemitido);
        return funcionarioDemitido;
    }

    public String gerarHash(String input) 
    {
        try
        {
            MessageDigest digest =MessageDigest.getInstance("CHA-256");
            Byte[] hashBytes =digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for(byte b : hashBytes)
            {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
        }
    }
}