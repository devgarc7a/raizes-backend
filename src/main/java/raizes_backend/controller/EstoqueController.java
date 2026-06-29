package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Estoque;
import raizes_backend.service.EstoqueService;

import java.util.List;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {

    private final EstoqueService estoqueService;


    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }


    @GetMapping
    public List<Estoque> listar() {
        return estoqueService.listarEstoques();
    }


    @PostMapping
    public Estoque salvar(@RequestBody Estoque estoque) {
        return estoqueService.salvarEstoque(estoque);
    }


    @GetMapping("/{id}")
    public Estoque buscar(@PathVariable Long id) {
        return estoqueService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        estoqueService.excluirEstoque(id);
    }
}