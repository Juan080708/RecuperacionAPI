package sv.ricaldone.recuperacion.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import sv.ricaldone.recuperacion.dto.PedidoDTO;
import sv.ricaldone.recuperacion.Service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<PedidoDTO> listarTodos() {
        return pedidoService.listarTodos();
    }

    @PostMapping
    public PedidoDTO crear(@RequestBody PedidoDTO pedido) {
        return pedidoService.guardar(pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        pedidoService.eliminar(id);
    }
}
