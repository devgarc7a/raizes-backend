package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Fidelidade;
import raizes_backend.service.FidelidadeService;

import java.util.List;

@RestController
@RequestMapping("/fidelidades")
public class FidelidadeController {

    private final FidelidadeService fidelidadeService;


    public FidelidadeController(FidelidadeService fidelidadeService) {
        this.fidelidadeService = fidelidadeService;
    }


    @GetMapping
    public List<Fidelidade> listar() {
        return fidelidadeService.listarFidelidades();
    }


    @PostMapping
    public Fidelidade salvar(@RequestBody Fidelidade fidelidade) {
        return fidelidadeService.salvarFidelidade(fidelidade);
    }


    @GetMapping("/{id}")
    public Fidelidade buscar(@PathVariable Long id) {
        return fidelidadeService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        fidelidadeService.excluirFidelidade(id);
    }
}