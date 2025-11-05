package sv.ricaldone.recuperacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.ricaldone.recuperacion.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
