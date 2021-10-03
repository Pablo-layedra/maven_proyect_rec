package proyecto.reserva.vuelos;

public class VueloVacacional extends Vuelo {

	private int descuento;

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return " Boleto de avión [Nombre: " + getNombre() + "- Cedula: " + getCedula() + "- Codigo de vuelo: "
				+ getCodigoVuelo() + "- Destino: " + getDestino() + "- Fecha de viaje: " + getFechaViaje()
				+ "- Precio: " + getPrecio() + "USD - Descuento aplicado: " + descuento +"USD ]";
	}

}
