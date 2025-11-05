package sv.ricaldone.recuperacion.Service;

import sv.ricaldone.recuperacion.dto.PedidoDTO;
import java.util.List;

public interface PedidoService {
    List<PedidoDTO> listarTodos();
    PedidoDTO guardar(PedidoDTO pedidoDTO);
    void eliminar(Long id);
}
