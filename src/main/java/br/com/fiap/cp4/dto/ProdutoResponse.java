package br.com.fiap.cp4.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponse extends RepresentationModel<ProdutoResponse> implements Serializable{
    private Long id;
    private String nome;
    private String tipo;
    private String setor;
    private String tamanho;
    private int preco;
}
