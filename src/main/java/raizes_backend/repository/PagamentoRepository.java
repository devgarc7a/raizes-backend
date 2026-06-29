package raizes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raizes_backend.entity.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}