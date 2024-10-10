package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.ClientesDto;
import Dtos.VentasDto;
import Servicios.FicheroImplementacion;
import Servicios.FicheroInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/**
 * Clase principal de la aplicación
 */
public class Inicio {

	/**
	 * Metodo de entrada y salida de la aplicación
	 * <author> dmp - 10/10/24 </author>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ClientesDto> listaClientes = new ArrayList<ClientesDto>();
		List<VentasDto> listaVentas = new ArrayList<VentasDto>();
		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		
		try {
			String mensaje1 = "Entra en la aplicación";
			fi.ficheroLog(mensaje1);
			boolean cerrarMenu = false;
			int opcion;
			while (!cerrarMenu) {
				
				opcion = mi.menuYSeleccionPrincipal();
				switch (opcion) {
				case 0:
					String mensaje2 = "Cierra la aplicación";
					fi.ficheroLog(mensaje2);
					cerrarMenu = true;
					break;

					case 1:
						String mensaje3 = "Entra en el menu de empleado";
						fi.ficheroLog(mensaje3);
						int opcionEmpleado = mi.menuEmpleado();
						switch (opcionEmpleado) {
						case 0:
							break;
						case 1:
							String mensaje5 = "Entra en la funcionalidad de calculo total";
							fi.ficheroLog(mensaje5);
							oi.calculoTotalVentas(listaVentas);
							break;
						case 2:
							String mensaje6 = "Entra en la funcionalidad de añadir compra";
							fi.ficheroLog(mensaje6);
							oi.aniadirCompra(listaVentas);
							break;

						default:
							System.out.println("La opcion seleccionada no existe");
							break;
						}
						break;
					case 2:
						String mensaje4 = "Entra en el menu de gerencia";
						fi.ficheroLog(mensaje4);
						int opcionGerencia = mi.menuGerencia();
						switch (opcionGerencia) {
						case 0:
							
							break;
						case 1:
							String mensaje7 = "Entra en la funcionalidad de dar alta cliente";
							fi.ficheroLog(mensaje7);
							oi.darAltaCliente(listaClientes);
							break;
						

						default:
							System.out.println("La opcion seleccionada no existe");
							break;
						}
						break;
				default:
					System.out.println("La opcion seleccionada no existe");
					break;
				}
				
			}
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error en el dar alta cliente vuelvelo a intentar en 10 minutos");
			String mensaje = e.getMessage();
			fi.ficheroLog(mensaje);
		}
		
	}

}
