package raizes_backend.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProduto;
    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;

    @OneToMany(mappedBy = "produto")
    private List<ItemPedido> itens;

    @OneToMany(mappedBy = "produto")
    private List<Estoque> estoques;


    public Produto() {
    }


    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}