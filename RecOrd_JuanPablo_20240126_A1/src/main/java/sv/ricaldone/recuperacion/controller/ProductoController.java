package sv.ricaldone.recuperacion.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import sv.ricaldone.recuperacion.dto.ProductoDTO;
import sv.ricaldone.recuperacion.Service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoDTO> listarTodos() {
        return productoService.listarTodos();
    }

    @PostMapping
    public ProductoDTO crear(@RequestBody ProductoDTO producto) {
        return productoService.guardar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminar(id);
    }
}
