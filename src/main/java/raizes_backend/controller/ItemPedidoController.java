package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.ItemPedido;
import raizes_backend.service.ItemPedidoService;

import java.util.List;

@RestController
@RequestMapping("/itens-pedido")
public class ItemPedidoController {

    private final ItemPedidoService itemPedidoService;


    public ItemPedidoController(ItemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }


    @GetMapping
    public List<ItemPedido> listar() {
        return itemPedidoService.listarItens();
    }


    @PostMapping
    public ItemPedido salvar(@RequestBody ItemPedido itemPedido) {
        return itemPedidoService.salvarItem(itemPedido);
    }


    @GetMapping("/{id}")
    public ItemPedido buscar(@PathVariable Long id) {
        return itemPedidoService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        itemPedidoService.excluirItem(id);
    }
}