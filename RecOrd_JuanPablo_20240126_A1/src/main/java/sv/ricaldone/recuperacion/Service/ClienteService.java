package sv.ricaldone.recuperacion.Service;

import sv.ricaldone.recuperacion.dto.ClienteDTO;
import java.util.List;

public interface ClienteService {
    List<ClienteDTO> listarTodos();
    ClienteDTO guardar(ClienteDTO clienteDTO);
    void eliminar(Long id);
}
