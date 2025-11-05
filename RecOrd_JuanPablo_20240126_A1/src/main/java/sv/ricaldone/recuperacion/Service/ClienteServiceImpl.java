package sv.ricaldone.recuperacion.Service;

import org.springframework.stereotype.Service;
import sv.ricaldone.recuperacion.dto.ClienteDTO;
import sv.ricaldone.recuperacion.entity.Cliente;
import sv.ricaldone.recuperacion.mapper.ClienteMapper;
import sv.ricaldone.recuperacion.repository.ClienteRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll()
                .stream()
                .map(ClienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO guardar(ClienteDTO clienteDTO) {
        if (clienteRepository.existsByEmail(clienteDTO.getEmail())) {
            throw new RuntimeException("El correo ya está registrado");
        }

        Cliente cliente = ClienteMapper.toEntity(clienteDTO);
        Cliente guardado = clienteRepository.save(cliente);
        return ClienteMapper.toDTO(guardado);
    }

    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}
