package sv.ricaldone.recuperacion.dto;

import java.util.Date;

public class PedidoDTO {
    private Long pedidoId;
    private Date fechaPedido;
    private Integer cantidad;
    private Double total;
    private Long clienteId;
    private Long productoId;
    // getters y setters
    public Long getPedidoId() { return pedidoId; }
    public void setPedidoId(Long pedidoId) { this.pedidoId = pedidoId; }
    public Date getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(Date fechaPedido) { this.fechaPedido = fechaPedido; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }
    public Long getProductoId() { return productoId; }
    public void setProductoId(Long productoId) { this.productoId = productoId; }
}
