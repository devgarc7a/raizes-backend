package raizes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raizes_backend.entity.Estoque;

import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    Optional<Estoque> findByProduto_IdProduto(Long idProduto);

}