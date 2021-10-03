package proyecto.reserva.vuelos;

public class VueloComercial extends Vuelo {

	private String codigoTrabajo;

	public String getCodigoTrabajo() {
		return codigoTrabajo;
	}

	public void setCodigoTrabajo(String codigoTrabajo) {
		this.codigoTrabajo = codigoTrabajo;
	}

	@Override
	public String toString() {
		return "Boleto de avion [Nombre: " + getNombre() + "- Cedula: " + getCedula() + "- Codigo de trabajo: "
				+ codigoTrabajo + "- Codigo de vuelo: " + getCodigoVuelo() + "- Destino: " + getDestino()
				+ "- Fecha de viaje: " + getFechaViaje() + "- Precio: " + getPrecio() + " USD]";
	}

}
