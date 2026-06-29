package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Estoque;
import raizes_backend.entity.ItemPedido;
import raizes_backend.repository.EstoqueRepository;
import raizes_backend.repository.ItemPedidoRepository;

import java.util.List;

@Service
public class ItemPedidoService {

    private final ItemPedidoRepository itemPedidoRepository;
    private final EstoqueRepository estoqueRepository;

    public ItemPedidoService(
            ItemPedidoRepository itemPedidoRepository,
            EstoqueRepository estoqueRepository
    ) {
        this.itemPedidoRepository = itemPedidoRepository;
        this.estoqueRepository = estoqueRepository;
    }

    // Retorna todos os itens cadastrados nos pedidos
    public List<ItemPedido> listarItens() {
        return itemPedidoRepository.findAll();
    }

    // Salva um item no pedido e atualiza o estoque do produto
    public ItemPedido salvarItem(ItemPedido itemPedido) {

        Long idProduto = itemPedido.getProduto().getIdProduto();

        Estoque estoque = estoqueRepository.findByProduto_IdProduto(idProduto)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Estoque não encontrado para este produto."
                        ));

        if (estoque.getQuantidade() < itemPedido.getQuantidade()) {
            throw new RuntimeException(
                    "Não há estoque suficiente para concluir o pedido."
            );
        }

        estoque.setQuantidade(
                estoque.getQuantidade() - itemPedido.getQuantidade()
        );

        estoqueRepository.save(estoque);

        return itemPedidoRepository.save(itemPedido);
    }

    // Busca um item do pedido pelo ID
    public ItemPedido buscarPorId(Long id) {
        return itemPedidoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Item do pedido não encontrado."
                        ));
    }

    // Exclui um item do pedido pelo ID
    public void excluirItem(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}