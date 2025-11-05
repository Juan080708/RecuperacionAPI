package sv.ricaldone.recuperacion.mapper;

import sv.ricaldone.recuperacion.dto.PedidoDTO;
import sv.ricaldone.recuperacion.entity.Pedido;
import sv.ricaldone.recuperacion.entity.Cliente;
import sv.ricaldone.recuperacion.entity.Producto;

public class PedidoMapper {

    public static PedidoDTO toDTO(Pedido pedido) {
        PedidoDTO dto = new PedidoDTO();
        dto.setPedidoId(pedido.getId());
        dto.setFechaPedido(pedido.getFechaPedido());
        dto.setCantidad(pedido.getCantidad());
        dto.setTotal(pedido.getTotal());
        dto.setClienteId(pedido.getCliente().getClienteId());
        dto.setProductoId(pedido.getProducto().getProductoId());
        return dto;
    }

    public static Pedido toEntity(PedidoDTO dto, Cliente cliente, Producto producto) {
        Pedido pedido = new Pedido();
        pedido.setId(dto.getPedidoId());
        pedido.setFechaPedido(dto.getFechaPedido());
        pedido.setCantidad(dto.getCantidad());
        pedido.setTotal(dto.getTotal());
        pedido.setCliente(cliente);
        pedido.setProducto(producto);
        return pedido;
    }
}
