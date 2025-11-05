package sv.ricaldone.recuperacion.Service;

import org.springframework.stereotype.Service;
import sv.ricaldone.recuperacion.dto.PedidoDTO;
import sv.ricaldone.recuperacion.entity.Cliente;
import sv.ricaldone.recuperacion.entity.Pedido;
import sv.ricaldone.recuperacion.entity.Producto;
import sv.ricaldone.recuperacion.mapper.PedidoMapper;
import sv.ricaldone.recuperacion.repository.ClienteRepository;
import sv.ricaldone.recuperacion.repository.PedidoRepository;
import sv.ricaldone.recuperacion.repository.ProductoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final ProductoRepository productoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository,
                             ClienteRepository clienteRepository,
                             ProductoRepository productoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
        this.productoRepository = productoRepository;
    }

    public List<PedidoDTO> listarTodos() {
        return pedidoRepository.findAll()
                .stream()
                .map(PedidoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PedidoDTO guardar(PedidoDTO pedidoDTO) {
        Cliente cliente = clienteRepository.findById(pedidoDTO.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        Producto producto = productoRepository.findById(pedidoDTO.getProductoId())
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        Pedido pedido = PedidoMapper.toEntity(pedidoDTO, cliente, producto);
        Pedido guardado = pedidoRepository.save(pedido);
        return PedidoMapper.toDTO(guardado);
    }

    public void eliminar(Long id) {
        pedidoRepository.deleteById(id);
    }
}
