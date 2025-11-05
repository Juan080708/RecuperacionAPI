package sv.ricaldone.recuperacion.dto;

import java.util.Date;

public class ClienteDTO {
    private Long clienteId;
    private String nombre;
    private String email;
    private String telefono;
    private Date fechaRegistro;
    private String activo;
    // getters y setters
    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }
    public String getActivo() { return activo; }
    public void setActivo(String activo) { this.activo = activo; }
}
