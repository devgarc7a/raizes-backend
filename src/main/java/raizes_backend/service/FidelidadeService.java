package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Fidelidade;
import raizes_backend.repository.FidelidadeRepository;

import java.util.List;

@Service
public class FidelidadeService {

    private final FidelidadeRepository fidelidadeRepository;


    public FidelidadeService(FidelidadeRepository fidelidadeRepository) {
        this.fidelidadeRepository = fidelidadeRepository;
    }


    public List<Fidelidade> listarFidelidades() {
        return fidelidadeRepository.findAll();
    }


    public Fidelidade salvarFidelidade(Fidelidade fidelidade) {
        return fidelidadeRepository.save(fidelidade);
    }


    public Fidelidade buscarPorId(Long id) {
        return fidelidadeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fidelidade não encontrada"));
    }


    public void excluirFidelidade(Long id) {
        fidelidadeRepository.deleteById(id);
    }
}