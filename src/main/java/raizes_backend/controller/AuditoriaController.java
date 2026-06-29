package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Auditoria;
import raizes_backend.service.AuditoriaService;

import java.util.List;

@RestController
@RequestMapping("/auditorias")
public class AuditoriaController {

    private final AuditoriaService auditoriaService;


    public AuditoriaController(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }


    @GetMapping
    public List<Auditoria> listar() {
        return auditoriaService.listarAuditorias();
    }


    @PostMapping
    public Auditoria salvar(@RequestBody Auditoria auditoria) {
        return auditoriaService.salvarAuditoria(auditoria);
    }


    @GetMapping("/{id}")
    public Auditoria buscar(@PathVariable Long id) {
        return auditoriaService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        auditoriaService.excluirAuditoria(id);
    }
}