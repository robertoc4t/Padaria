package com.padaria.padaria.DTOs;
import java.util.Date;

public record ProdutoDTO(String nome, String descricao, String tipo, Date dataDeFabricacao){}
