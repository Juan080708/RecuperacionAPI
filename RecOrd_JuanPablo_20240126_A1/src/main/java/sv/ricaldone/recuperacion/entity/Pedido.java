package sv.ricaldone.recuperacion.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PEDIDOS")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PEDIDO_ID")
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_PEDIDO")
    private Date fechaPedido;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "TOTAL")
    private Double total;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "PRODUCTO_ID")
    private Producto producto;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(Date fechaPedido) { this.fechaPedido = fechaPedido; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}
