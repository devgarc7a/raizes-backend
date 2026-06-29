package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Cliente;
import raizes_backend.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;


    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listarClientes();
    }


    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }


    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        clienteService.excluirCliente(id);
    }
}