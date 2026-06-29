package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Produto;
import raizes_backend.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;


    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }


    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }


    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }


    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}