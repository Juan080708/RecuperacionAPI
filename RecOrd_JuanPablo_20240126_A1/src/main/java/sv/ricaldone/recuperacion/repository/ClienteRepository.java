package sv.ricaldone.recuperacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.ricaldone.recuperacion.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByEmail(String email);
}
