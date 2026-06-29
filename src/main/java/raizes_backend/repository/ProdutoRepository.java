package raizes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raizes_backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}