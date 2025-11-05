package sv.ricaldone.recuperacion.Service;

import sv.ricaldone.recuperacion.dto.ProductoDTO;
import java.util.List;

public interface ProductoService {
    List<ProductoDTO> listarTodos();
    ProductoDTO guardar(ProductoDTO productoDTO);
    void eliminar(Long id);
}
