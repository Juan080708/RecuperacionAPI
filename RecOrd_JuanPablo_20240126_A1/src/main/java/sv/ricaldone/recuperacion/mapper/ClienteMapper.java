package sv.ricaldone.recuperacion.mapper;

import sv.ricaldone.recuperacion.dto.ClienteDTO;
import sv.ricaldone.recuperacion.entity.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setClienteId(cliente.getClienteId());
        dto.setNombre(cliente.getNombre());
        dto.setEmail(cliente.getEmail());
        dto.setTelefono(cliente.getTelefono());
        dto.setFechaRegistro(cliente.getFechaRegistro());
        dto.setActivo(cliente.getActivo());
        return dto;
    }

    public static Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setClienteId(dto.getClienteId());
        cliente.setNombre(dto.getNombre());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefono(dto.getTelefono());
        cliente.setFechaRegistro(dto.getFechaRegistro());
        cliente.setActivo(dto.getActivo());
        return cliente;
    }
}
