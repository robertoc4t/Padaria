package com.padaria.padaria.repository;
// Essa camada de repositorio vai ser responsavel por armazenar os dados da nossa padaria, por hora claro, não trabalhar muito aqui
import java.util.ArrayList;

import com.padaria.padaria.entities.Funcionario;

public class Funcionarios {
    
    private ArrayList<Funcionario> padeiros;


    public Funcionarios() {
        this.padeiros = new ArrayList<>();
    }


    public void addFuncionario(Funcionario padeiro) {
        this.padeiros.add(padeiro);
    }   

    public ArrayList<Funcionario> listarTodosPadeiros() {
        return padeiros;
    }

    public void adicionarPadeiro(Funcionario padeiro) 
    {
       this.padeiros.add(padeiro);
    }


    public String removerPadeiro(Funcionario padeiro) 
    {
        if (this.padeiros.contains(padeiro)) 
        {
            this.padeiros.remove(padeiro);
            return "Padeiro removido com sucesso.";
        }
        return "Padeiro não encontrado.";
    }   

    
    public String consultarPadeiros() 
    {
        StringBuilder listaDePadeiros = new StringBuilder();
        if (this.padeiros.isEmpty()) 
        {
            return "Nenhum padeiro cadastrado.";
        }
        for (Funcionario padeiro : this.padeiros) 
        {
            listaDePadeiros.append(padeiro.toString());
        }       
        return listaDePadeiros.toString();
    }  

    @Override
    public String toString() 
    {
        return "Funcionarios{" +
                "padeiros=" + padeiros +
                '}';
    }   


}
