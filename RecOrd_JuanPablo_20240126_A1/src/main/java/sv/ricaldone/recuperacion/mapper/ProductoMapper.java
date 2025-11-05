package sv.ricaldone.recuperacion.mapper;

import sv.ricaldone.recuperacion.dto.ProductoDTO;
import sv.ricaldone.recuperacion.entity.Producto;

public class ProductoMapper {

    public static ProductoDTO toDTO(Producto producto) {
        ProductoDTO dto = new ProductoDTO();
        dto.setProductoId(producto.getProductoId());
        dto.setNombre(producto.getNombre());
        dto.setDescripcion(producto.getDescripcion());
        dto.setPrecio(producto.getPrecio());
        dto.setStock(producto.getStock());
        dto.setCategoria(producto.getCategoria());
        dto.setFechaCreacion(producto.getFechaCreacion());
        return dto;
    }

    public static Producto toEntity(ProductoDTO dto) {
        Producto producto = new Producto();
        producto.setProductoId(dto.getProductoId());
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        producto.setCategoria(dto.getCategoria());
        producto.setFechaCreacion(dto.getFechaCreacion());
        return producto;
    }
}
