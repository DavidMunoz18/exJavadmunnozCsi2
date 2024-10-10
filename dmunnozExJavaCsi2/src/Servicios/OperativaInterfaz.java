package Servicios;

import java.util.List;

import Dtos.ClientesDto;
import Dtos.VentasDto;
/**
 * Clase que contiene los metodos con las operativas que manejan los clientes y las ventas
 * <author> dmp - 10/10/24 </author>
 */
public interface OperativaInterfaz {

	/**
	 * Metodo que da de alta el cliente
	 * <author> dmp - 10/10/24 </author>
	 * @param listaClientes
	 */
	public void darAltaCliente(List<ClientesDto> listaClientes);
	
	/**
	 * Metodo que añade la compra
	 * <author> dmp - 10/10/24 </author>
	 * @param listaVentas
	 */
	public void aniadirCompra(List<VentasDto> listaVentas);
	
	/**
	 * Metodo que realiza el calculo total de las ventas
	 * <author> dmp - 10/10/24 </author>
	 * @param listaVentas
	 */
	public void calculoTotalVentas(List<VentasDto> listaVentas);
}
