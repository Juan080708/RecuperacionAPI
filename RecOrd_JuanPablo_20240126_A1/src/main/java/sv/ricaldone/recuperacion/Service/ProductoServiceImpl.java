package sv.ricaldone.recuperacion.Service;

import org.springframework.stereotype.Service;
import sv.ricaldone.recuperacion.dto.ProductoDTO;
import sv.ricaldone.recuperacion.entity.Producto;
import sv.ricaldone.recuperacion.mapper.ProductoMapper;
import sv.ricaldone.recuperacion.repository.ProductoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductoDTO> listarTodos() {
        return productoRepository.findAll()
                .stream()
                .map(ProductoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProductoDTO guardar(ProductoDTO productoDTO) {
        Producto producto = ProductoMapper.toEntity(productoDTO);
        Producto guardado = productoRepository.save(producto);
        return ProductoMapper.toDTO(guardado);
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}
