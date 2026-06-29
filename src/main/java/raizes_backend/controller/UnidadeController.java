package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Unidade;
import raizes_backend.service.UnidadeService;

import java.util.List;

@RestController
@RequestMapping("/unidades")
public class UnidadeController {

    private final UnidadeService unidadeService;


    public UnidadeController(UnidadeService unidadeService) {
        this.unidadeService = unidadeService;
    }


    @GetMapping
    public List<Unidade> listar() {
        return unidadeService.listarUnidades();
    }


    @PostMapping
    public Unidade salvar(@RequestBody Unidade unidade) {
        return unidadeService.salvarUnidade(unidade);
    }


    @GetMapping("/{id}")
    public Unidade buscar(@PathVariable Long id) {
        return unidadeService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        unidadeService.excluirUnidade(id);
    }
}