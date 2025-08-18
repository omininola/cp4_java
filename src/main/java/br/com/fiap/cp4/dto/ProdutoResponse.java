package br.com.fiap.cp4.dto;

import java.util.List;

import org.springframework.hateoas.Link;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponse {
    private Long id;
    private String nome;
    private String tipo;
    private String setor;
    private String tamanho;
    private int preco;
    private List<Link> links;
}
