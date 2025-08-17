package com.padaria.padaria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padaria.padaria.entities.Message;


@RestController
public class PainelController {

    @GetMapping("/painel")
    public Message painel() {
        return new Message("Bem-vindo ao painel da padaria!");
    }
}