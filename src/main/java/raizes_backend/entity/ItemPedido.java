package raizes_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "itens_pedido")
public class ItemPedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;


    private Integer quantidade;


    private Double precoUnitario;


    @ManyToOne
    private Pedido pedido;


    @ManyToOne
    private Produto produto;



    public ItemPedido() {
    }



    public Long getIdItem() {
        return idItem;
    }


    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }



    public Integer getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }



    public Double getPrecoUnitario() {
        return precoUnitario;
    }


    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }



    public Pedido getPedido() {
        return pedido;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }



    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}