package Dtos;
/**
 * Clase que contiene los atributos, getters y setter y constructores para crear los clientes
 * <author> dmp - 10/10/24 </author>
 */
public class ClientesDto {

	long id;
	String nombreCliente = "aaaaa";
	String apellidosClienteString = "aaaaa";
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosClienteString() {
		return apellidosClienteString;
	}
	public void setApellidosClienteString(String apellidosClienteString) {
		this.apellidosClienteString = apellidosClienteString;
	}
	public ClientesDto() {
		super();
	}
	public ClientesDto(long id, String nombreCliente, String apellidosClienteString) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.apellidosClienteString = apellidosClienteString;
	}
	@Override
	public String toString() {
		return "ClientesDto [id=" + id + ", nombreCliente=" + nombreCliente + ", apellidosClienteString="
				+ apellidosClienteString + "]";
	}
	
	
}
