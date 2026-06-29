package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Estoque;
import raizes_backend.repository.EstoqueRepository;

import java.util.List;

@Service
public class EstoqueService {

    private final EstoqueRepository estoqueRepository;


    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }


    public List<Estoque> listarEstoques() {
        return estoqueRepository.findAll();
    }


    public Estoque salvarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }


    public Estoque buscarPorId(Long id) {
        return estoqueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estoque não encontrado"));
    }


    public void excluirEstoque(Long id) {
        estoqueRepository.deleteById(id);
    }
}