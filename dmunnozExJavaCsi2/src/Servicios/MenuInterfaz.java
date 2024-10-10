package Servicios;

/**
 * Clase que contiene los metodos que maneja el menu
 * <author> dmp - 10/10/24 </author>
 */
public interface MenuInterfaz {

	/**
	 * Metodo que muestra y permite seleccionar una opcion en el menu principal
	 * <author> dmp - 10/10/24 </author>
	 * @return
	 */
	public int menuYSeleccionPrincipal();
	
	/**
	 * Metodo que muestra y permite seleccionar una opcion en el menu de gerencia
	 * <author> dmp - 10/10/24 </author>
	 * @return
	 */
	public int menuGerencia();
	/**
	 * Metodo que muestra y permite seleccionar una opcion en el menu del empleado
	 * <author> dmp - 10/10/24 </author>
	 * @return
	 */
	public int menuEmpleado();
}
