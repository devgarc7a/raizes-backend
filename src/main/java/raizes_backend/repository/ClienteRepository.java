package raizes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raizes_backend.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}