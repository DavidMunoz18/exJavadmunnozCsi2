package Servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase que implementa los metodos de la interfaz del fichero.
 * <author> dmp - 10/10/24 </author>
 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void ficheroLog(String mensaje) {
		
		String ruta = "C:\\Users\\dmunnoz\\eclipse-workspace\\dmunnozExJavaCsi2\\src\\auditoria\\fichero-log.txt";
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(ruta , true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.write(mensaje + "\n");
			
			fileWriter.close();
		} catch (IOException e) {
			String mensaje1 = e.getMessage();
			ficheroLog(mensaje1);
			System.out.println("Ha ocurrido un error en el fichero, vuelvelo a intentar en 10 minutos");
			
		}
		
		
		
		
		
	}

}
