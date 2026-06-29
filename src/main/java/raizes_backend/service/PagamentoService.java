package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Pagamento;
import raizes_backend.entity.Pedido;
import raizes_backend.repository.PagamentoRepository;
import raizes_backend.repository.PedidoRepository;

import java.util.List;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;
    private final PedidoRepository pedidoRepository;

    public PagamentoService(
            PagamentoRepository pagamentoRepository,
            PedidoRepository pedidoRepository
    ) {
        this.pagamentoRepository = pagamentoRepository;
        this.pedidoRepository = pedidoRepository;
    }

    // Retorna todos os pagamentos cadastrados
    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    // Salva um pagamento e atualiza o status do pedido
    public Pagamento salvarPagamento(Pagamento pagamento) {

        Pagamento pagamentoSalvo =
                pagamentoRepository.save(pagamento);

        if ("APROVADO".equals(pagamento.getStatus())
                && pagamento.getPedido() != null) {

            Pedido pedido = pagamento.getPedido();

            pedido.setStatus("PAGO");

            pedidoRepository.save(pedido);
        }

        return pagamentoSalvo;
    }

    // Busca um pagamento pelo ID
    public Pagamento buscarPorId(Long id) {

        return pagamentoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Pagamento não encontrado."
                        ));
    }

    // Exclui um pagamento pelo ID
    public void excluirPagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }
}