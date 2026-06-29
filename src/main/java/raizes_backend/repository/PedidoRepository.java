package raizes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raizes_backend.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}