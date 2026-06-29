package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Produto;
import raizes_backend.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;


    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarProdutos();
    }


    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvarProduto(produto);
    }


    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        produtoService.excluirProduto(id);
    }
}