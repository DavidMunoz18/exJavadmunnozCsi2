package Servicios;

import java.util.Scanner;

/**
 * Clase que implementa los metodos de la interfaz del menu.
 * <author> dmp - 10/10/24 </author>
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	public int menuYSeleccionPrincipal() {
		
		int opcion;
		System.out.println("0. Cerrar menu");
		System.out.println("1. Menu Empleado");
		System.out.println("2. Menu Gerencia");
		opcion = sc.nextInt();
		
		return opcion;
	}
	@Override
	public int menuGerencia() {
		
		int opcion;
		System.out.println("0. Volver");
		System.out.println("1. Crear un nuevo cliente");
		
		opcion = sc.nextInt();
		return opcion;
	}
	@Override
	public int menuEmpleado() {
		
		int opcion;
		System.out.println("0. Volver");
		System.out.println("1. Calculo total de ventas mensual");
		System.out.println("2. Añadir compras a un cliente");
		opcion = sc.nextInt();
		
		return opcion;
	}

}
