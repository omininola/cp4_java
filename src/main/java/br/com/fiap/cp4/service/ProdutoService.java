package br.com.fiap.cp4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.cp4.dto.ProdutoRequest;
import br.com.fiap.cp4.dto.ProdutoResponse;
import br.com.fiap.cp4.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoResponse create(ProdutoRequest produtoRequest){
        return new ProdutoResponse();
    }

    public List<ProdutoResponse> readAll(){
        return new ArrayList<ProdutoResponse>();
    }

    public Optional<ProdutoResponse> readById(Long id){
        return Optional.ofNullable(null);
    }

    public Optional<ProdutoResponse> update(Long id, ProdutoRequest produtoRequest){
        return Optional.ofNullable(null);
    }

    public boolean delete(Long id){
        return false;
    }
}
