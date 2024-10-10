package Dtos;

import java.time.LocalDateTime;

/**
 * Clase contiene los atributos , getter y setters y constructores para dar de altas las ventas
 * <author> dmp - 10/10/24 </author>
 */
public class VentasDto {

	long id;
	double importe = 0.0;
	LocalDateTime fchaInstante = LocalDateTime.now();
	long idCliente;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public LocalDateTime getFchaInstante() {
		return fchaInstante;
	}
	public void setFchaInstante(LocalDateTime fchaInstante) {
		this.fchaInstante = fchaInstante;
	}
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public VentasDto() {
		super();
	}
	public VentasDto(long id, double importe, LocalDateTime fchaInstante) {
		super();
		this.id = id;
		this.importe = importe;
		this.fchaInstante = fchaInstante;
	}
	@Override
	public String toString() {
		return "VentasDto [id=" + id + ", importe=" + importe + ", fchaInstante=" + fchaInstante + "]";
	}
	
	
}
