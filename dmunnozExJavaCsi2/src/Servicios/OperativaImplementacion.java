package Servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import Dtos.ClientesDto;
import Dtos.VentasDto;

/**
 * Clase que implementa los metodos de la interfaz de la operativa
 * <author> dmp - 10/10/24 </author>
 */
public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
	FicheroInterfaz fi = new FicheroImplementacion();
	
	public void darAltaCliente(List<ClientesDto> listaClientes) {
		
		try {
			ClientesDto clientesDto = crearCliente(listaClientes);
			
			listaClientes.add(clientesDto);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error en el dar alta cliente vuelvelo a intentar en 10 minutos");
			String mensaje = e.getMessage();
			fi.ficheroLog(mensaje);
		}
		
		
	}
	private ClientesDto crearCliente(List<ClientesDto> listaClientes) {
		
		
		boolean cerrar = false;
		
		ClientesDto clientes = new ClientesDto();
		long id = idAutogeneradoCliente(listaClientes);
		clientes.setId(id);
		
		while (!cerrar) {
			System.out.println("¿Desea añadir un nuevo cliente? (si/no) ");
			String respuesta = sc.next();
			if(respuesta.toLowerCase().equals("si")) {
				
				
				
				
				System.out.println("Introduce el nombre del cliente");
				clientes.setNombreCliente(sc.next());
				
				System.out.println("Introduce el apellido");
				clientes.setApellidosClienteString(sc.next());
			}else {
				cerrar = true;
			}
			
			
			
		}
		return clientes;
		
		
	}
	private long idAutogeneradoCliente(List<ClientesDto> listaClientes) {
		
		long id;
		
		int tamanioLista = listaClientes.size();
		
		if(tamanioLista == 0) {
			id = 1;
		}
		else {
			id = listaClientes.get(tamanioLista - 1).getId() + 1;
		}
		return id;
		
		
	}
	@Override
	public void aniadirCompra(List<VentasDto> listaVentas) {
		
		try {
			VentasDto ventas = darAltaCompra(listaVentas);
			
			listaVentas.add(ventas);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error en el añadir compra vuelvelo a intentar en 10 minutos");
			String mensaje = e.getMessage();
			fi.ficheroLog(mensaje);
		}
		
		
		
	}
	private VentasDto darAltaCompra(List<VentasDto> listaVentas) {
		
		VentasDto ventas = new VentasDto();
		
		long id = idAutogeneradoCompra(listaVentas);
		
		ventas.setId(id);
		
		System.out.println("ID compra: " + ventas.getId());
		
		System.out.println("Introduce el id del cliente");
		ventas.setIdCliente(sc.nextLong());
		
		System.out.println("Introduce el importe");
		ventas.setImporte(sc.nextDouble());
		
		LocalDateTime fechaInstante = LocalDateTime.now(); 
		
		ventas.setFchaInstante(fechaInstante);
		
		System.out.println("Fecha Instante: " + ventas.getFchaInstante());
		
		
		return ventas;
		
		
	}
private long idAutogeneradoCompra(List<VentasDto> listaVentas) {
		
		long id;
		
		int tamanioLista = listaVentas.size();
		
		if(tamanioLista == 0) {
			id = 1;
		}
		else {
			id = listaVentas.get(tamanioLista - 1).getId() + 1;
		}
		return id;
		
		
	}
@Override
public void calculoTotalVentas(List<VentasDto> listaVentas) {
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-yyyy");
	
	try {
		System.out.println("Introduce la fecha del mes que quieres realizar el calculo (MM-yyyy)");
		String fchaMes = sc.next();
		
		double Importetotal = 0.0;
		
		
		
		for (VentasDto ventas : listaVentas) {
			
			Importetotal = Importetotal + ventas.getImporte();
			
			if(ventas.getFchaInstante().format(dateTimeFormatter).equals(fchaMes)) {
				
				//System.out.println("Id venta: " + ventas.getId());
				//System.out.println("Id cliente: " + ventas.getIdCliente());
				//System.out.println("Importe: " + ventas.getImporte());
				System.out.println("Importe total: " + Importetotal);
			}
		}
	} catch (Exception e) {
		System.out.println("Ha ocurrido un error en el calculo total de ventas vuelvelo a intentar en 10 minutos");
		String mensaje = e.getMessage();
		fi.ficheroLog(mensaje);
	}
	
	
}
	

}
