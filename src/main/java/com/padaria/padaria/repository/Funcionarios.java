package com.padaria.padaria.repository;
// Essa camada de repositorio vai ser responsavel por armazenar os dados da nossa padaria, por hora claro, não trabalhar muito aqui
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padaria.padaria.entities.Funcionario;

@Repository
public interface Funcionarios extends JpaRepository<Funcionario, Long>  {
    

}
