package sv.ricaldone.recuperacion.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import sv.ricaldone.recuperacion.dto.ClienteDTO;
import sv.ricaldone.recuperacion.Service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<ClienteDTO> listarTodos() {
        return clienteService.listarTodos();
    }

    @PostMapping
    public ClienteDTO crear(@RequestBody ClienteDTO cliente) {
        return clienteService.guardar(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        clienteService.eliminar(id);
    }
}
