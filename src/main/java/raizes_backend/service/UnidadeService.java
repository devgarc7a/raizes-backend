package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Unidade;
import raizes_backend.repository.UnidadeRepository;

import java.util.List;

@Service
public class UnidadeService {

    private final UnidadeRepository unidadeRepository;


    public UnidadeService(UnidadeRepository unidadeRepository) {
        this.unidadeRepository = unidadeRepository;
    }


    public List<Unidade> listarUnidades() {
        return unidadeRepository.findAll();
    }


    public Unidade salvarUnidade(Unidade unidade) {
        return unidadeRepository.save(unidade);
    }


    public Unidade buscarPorId(Long id) {
        return unidadeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Unidade não encontrada"));
    }


    public void excluirUnidade(Long id) {
        unidadeRepository.deleteById(id);
    }
}