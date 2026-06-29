package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Auditoria;
import raizes_backend.repository.AuditoriaRepository;

import java.util.List;

@Service
public class AuditoriaService {

    private final AuditoriaRepository auditoriaRepository;


    public AuditoriaService(AuditoriaRepository auditoriaRepository) {
        this.auditoriaRepository = auditoriaRepository;
    }


    public List<Auditoria> listarAuditorias() {
        return auditoriaRepository.findAll();
    }


    public Auditoria salvarAuditoria(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }


    public Auditoria buscarPorId(Long id) {
        return auditoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Auditoria não encontrada"));
    }


    public void excluirAuditoria(Long id) {
        auditoriaRepository.deleteById(id);
    }
}