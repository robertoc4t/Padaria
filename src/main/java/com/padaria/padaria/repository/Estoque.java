package com.padaria.padaria.repository;

import java.util.ArrayList;

import com.padaria.padaria.entities.Produto;

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

    public String removerProduto(Produto produto)
    {
        if (this.produtos.contains(produto))
        {
            this.produtos.remove(produto);
        }
        return null;
    }

    public ArrayList<Produto> consultarEstoque()
    {
        return this.produtos;
    }

}
