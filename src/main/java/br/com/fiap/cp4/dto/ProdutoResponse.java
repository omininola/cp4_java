package br.com.fiap.cp4.dto;

import java.util.List;

import org.springframework.hateoas.Link;

public class ProdutoResponse {
    private Long id;
    private String nome;
    private String tipo;
    private String setor;
    private String tamanho;
    private int preco;
    private List<Link> links;
}
