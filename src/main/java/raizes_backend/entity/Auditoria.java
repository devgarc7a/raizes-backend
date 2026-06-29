package raizes_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "auditorias")
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idAuditoria;
    private String acao;
    private LocalDateTime dataHora;

    @ManyToOne
    private Usuario usuario;


    public Auditoria() {
    }


    public Long getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }


    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}