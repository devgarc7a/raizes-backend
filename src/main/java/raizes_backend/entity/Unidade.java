package raizes_backend.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "unidades")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUnidade;
    private String nome;
    private String cidade;
    private String estado;
    private String endereco;

    @OneToMany(mappedBy = "unidade")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "unidade")
    private List<Estoque> estoques;

    public Unidade() {
    }


    public Long getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Long idUnidade) {
        this.idUnidade = idUnidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}