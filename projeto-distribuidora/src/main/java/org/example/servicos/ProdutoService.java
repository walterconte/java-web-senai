package org.example.servicos;

import org.example.entidades.Produto;
import org.example.repositorios.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository produtoRepository;

    //Buscar tudo.
    public List<Produto> buscarTodos() {

        return produtoRepository.findAll();

    }

    //Buscar pelo ID.
    public Optional<Produto> buscarPorId(Long id) {

        return produtoRepository.findById(id);

    }


    //Inserir.
    public Produto inserir(Produto produto) {

        return produtoRepository.save(produto);

    }

    public Produto atualizar(Long id, Produto produtoAtualizado){

        return produtoRepository.findById(id).map(produto -> {produto.setNomeProduto(produtoAtualizado.getNomeProduto());
        produto.setPrecoProduto(produtoAtualizado.getPrecoProduto());
        produto.setFornecedor(produtoAtualizado.getFornecedor());
        return produtoRepository.save(produto);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado com ID" + id));

    }

    //Deletar.
    public void deletarId(Long id) {

        produtoRepository.deleteById(id);

    }

}
