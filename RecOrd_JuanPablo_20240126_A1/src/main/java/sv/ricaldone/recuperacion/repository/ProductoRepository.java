package sv.ricaldone.recuperacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.ricaldone.recuperacion.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
