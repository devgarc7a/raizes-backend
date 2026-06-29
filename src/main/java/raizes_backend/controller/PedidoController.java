package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Pedido;
import raizes_backend.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;


    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }


    @GetMapping
    public List<Pedido> listar() {
        return pedidoService.listarPedidos();
    }


    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return pedidoService.salvarPedido(pedido);
    }


    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        return pedidoService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        pedidoService.excluirPedido(id);
    }
}