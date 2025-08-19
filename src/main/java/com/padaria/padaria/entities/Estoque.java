package com.padaria.padaria.entities;

import java.util.ArrayList;

public class Estoque 
{
    private ArrayList<Produto> produtos;
    private int quantidade;

    public Estoque() 
    {
        this.produtos = new ArrayList<>();
        this.quantidade = 0;
    }

    public String adicionarProduto(Produto produto) 
    {  
        this.produtos.add(produto);
        return "o produto"+ produto.toString() +" foi adicionado com sucesso"; 
    }
}
