package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Pagamento;
import raizes_backend.service.PagamentoService;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;


    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }


    @GetMapping
    public List<Pagamento> listar() {
        return pagamentoService.listarPagamentos();
    }


    @PostMapping
    public Pagamento salvar(@RequestBody Pagamento pagamento) {
        return pagamentoService.salvarPagamento(pagamento);
    }


    @GetMapping("/{id}")
    public Pagamento buscar(@PathVariable Long id) {
        return pagamentoService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        pagamentoService.excluirPagamento(id);
    }
    }