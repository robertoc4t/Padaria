package com.padaria.padaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.padaria.padaria.entities.Message;
import com.padaria.padaria.services.PadariaServices;



@RestController
public class PainelController 
{

    @Autowired
    PadariaServices padariaServices;

    @GetMapping("/painel")
    public Message painel() 
    {
        return new Message("Bem-vindo ao painel da padaria!");
    }

    @PostMapping("/painel")
    public String postMethodName(@RequestBody String entity) {
        
        
        return entity;
    }
    
}