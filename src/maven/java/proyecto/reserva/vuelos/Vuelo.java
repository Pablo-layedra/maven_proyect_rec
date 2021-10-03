package proyecto.reserva.vuelos;

import java.time.LocalDate;

public class Vuelo {

	private String nombre;
	private String cedula;
	private int codigoVuelo;
	private String destino;
	private LocalDate fechaViaje;
	private int precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getCodigoVuelo() {
		return codigoVuelo;
	}

	public void setCodigoVuelo(int codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaViaje() {
		return fechaViaje;
	}

	public void setFechaViaje(LocalDate fechaViaje) {
		this.fechaViaje = fechaViaje;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[- Destino: " + destino + "- Precio: " + precio + "USD ]";
	}

}
