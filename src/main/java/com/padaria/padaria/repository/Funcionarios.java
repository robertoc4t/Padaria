package com.padaria.padaria.repository;
// Essa camada de repositorio vai ser responsavel por armazenar os dados da nossa padaria, por hora claro, não trabalhar muito aqui
import java.util.ArrayList;

import com.padaria.padaria.entities.Funcionario;

public class Funcionarios {
    
    private ArrayList<Funcionario> funcionarios;


    public Funcionarios() {
        this.funcionarios = new ArrayList<>();
    }


    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }   

    public ArrayList<Funcionario> listarTodofuncionarios() {
        return this.funcionarios;
    }

    public void adicionafuncionario(Funcionario funcionario) 
    {
       this.funcionarios.add(funcionario);
    }


    public String removerPadeiro(Funcionario padeiro) 
    {
        if (this.funcionarios.contains(padeiro)) 
        {
            this.funcionarios.remove(padeiro);
            return "Funcionario removido com sucesso.";
        }
        return "Funcionario não encontrado.";
    }   

    
    public String consultarPadeiros() 
    {
        StringBuilder listaDePadeiros = new StringBuilder();
        if (this.funcionarios.isEmpty()) 
        {
            return "Nenhum padeiro cadastrado.";
        }
        for (Funcionario padeiro : this.funcionarios) 
        {
            listaDePadeiros.append(padeiro.toString());
        }       
        return listaDePadeiros.toString();
    }  

    @Override
    public String toString() 
    {
        return "Funcionarios{" +
                "padeiros=" + funcionarios +
                '}';
    }   


}
