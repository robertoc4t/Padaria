package com.padaria.padaria.services;

import java.util.ArrayList;
import java.util.List;

import com.padaria.padaria.entities.Padeiro;
import com.padaria.padaria.entities.Produto;

public class PadariaServices {
    List<Produto> produtos = new ArrayList<>();
    List<Padeiro> padeiros = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarPadeiro(Padeiro padeiro){
        padeiros.add(padeiro);
    }

    
}
