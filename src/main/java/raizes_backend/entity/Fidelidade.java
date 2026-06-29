package raizes_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "fidelidades")
public class Fidelidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFidelidade;
    private Integer pontos;
    private LocalDateTime dataAtualizacao;

    @OneToOne(mappedBy = "fidelidade")
    private Cliente cliente;


    public Fidelidade() {
    }


    public Long getIdFidelidade() {
        return idFidelidade;
    }

    public void setIdFidelidade(Long idFidelidade) {
        this.idFidelidade = idFidelidade;
    }


    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }


    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}