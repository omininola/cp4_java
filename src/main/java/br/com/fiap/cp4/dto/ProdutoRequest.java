package br.com.fiap.cp4.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProdutoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String tipo;
    
    @NotBlank
    private String setor;
    
    @NotBlank
    private String tamanho;
    
    @NotNull
    @Positive
    private int preco;
}
