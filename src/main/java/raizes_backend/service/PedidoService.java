package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Pedido;
import raizes_backend.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    // Retorna todos os pedidos cadastrados
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    // Salva um novo pedido
    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Busca um pedido pelo ID
    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Pedido não encontrado."));
    }

    // Exclui um pedido pelo ID
    public void excluirPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}