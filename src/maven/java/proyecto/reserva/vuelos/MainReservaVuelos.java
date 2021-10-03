package proyecto.reserva.vuelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		Scanner teclado5 = new Scanner(System.in);

		String opcion;
		int NR = -1;
		int codigoVuelo = 1250;

		Vuelo[] destinos = new Vuelo[8];
		List<VueloComercial> vueloComercial = new ArrayList<VueloComercial>();
		List<VueloVacacional> vueloVacacional = new ArrayList<VueloVacacional>();

		Vuelo destino1 = new Vuelo();
		destino1.setDestino("Viena");
		destino1.setPrecio(350);

		Vuelo destino2 = new Vuelo();
		destino2.setDestino("Paris");
		destino2.setPrecio(300);

		Vuelo destino3 = new Vuelo();
		destino3.setDestino("New York");
		destino3.setPrecio(550);

		Vuelo destino4 = new Vuelo();
		destino4.setDestino("London");
		destino4.setPrecio(400);

		Vuelo destino5 = new Vuelo();
		destino5.setDestino("Sao Paulo");
		destino5.setPrecio(270);

		Vuelo destino6 = new Vuelo();
		destino6.setDestino("Medellin");
		destino6.setPrecio(100);

		Vuelo destino7 = new Vuelo();
		destino7.setDestino("Bogota");
		destino7.setPrecio(150);

		Vuelo destino8 = new Vuelo();
		destino8.setDestino("Tokio");
		destino8.setPrecio(600);

		destinos[0] = destino1;
		destinos[1] = destino2;
		destinos[2] = destino3;
		destinos[3] = destino4;
		destinos[4] = destino5;
		destinos[5] = destino6;
		destinos[6] = destino7;
		destinos[7] = destino8;

		do {
			System.out.println("##################################");
			System.out.println();
			System.out.println("AEROLINEA FLYPLANE: Seleccione su opción");
			System.out.println();
			System.out.println("1. Comprar vuelo ");
			System.out.println("2. Consultar vuelo ");
			System.out.println("3. SALIR");
			System.out.println();
			System.out.println("##################################");

			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				codigoVuelo = codigoVuelo + 1;
				LocalDate today = LocalDate.now();

				System.out.println();
				System.out.println("Ingresar su Nombre: ");
				String nombrePasajero = teclado2.nextLine();
				System.out.println("Ingresar su cedula: ");
				String cedulaPasajero = teclado2.nextLine();
				System.out.println("Seleccione el tipo de vuelo que desea comprar: ");
				System.out.println("1. Viaje Comercial ");
				System.out.println("2. Viaje Vacacional ");
				int tipoVuelo = teclado3.nextInt();

				if (tipoVuelo == 1) {

					VueloComercial vueloComComprado = new VueloComercial();

					System.out.println("Ingrese su codigo de trabajo: ");
					String codigoTrabajo = teclado2.nextLine();
					System.out.println("Destinos de viaje disponibles: ");
					System.out.println();

					for (int i = 0; i < 8; i++) {
						System.out.println(destinos[i]);
					}
					System.out.println();
					System.out.println("Seleccione su destino: ");
					String destinoViaje = teclado2.nextLine();

					for (int i = 0; i < 8; i++) {

						Vuelo destinoComparar = destinos[i];
						String destinoExistente = destinoComparar.getDestino();
						boolean comparacion = (destinoExistente.equals(destinoViaje));

						if (comparacion == true) {
							int precioVuelo = destinoComparar.getPrecio();
							vueloComComprado.setPrecio(precioVuelo);
						}

					}
					System.out.println("Ingresar fecha de vuelo (año(aaaa); mes(mm); dia(dd)");
					int año = teclado4.nextInt();
					int mes = teclado4.nextInt();
					int dia = teclado4.nextInt();

					LocalDate fechaDeViaje = LocalDate.of(año, mes, dia);

					vueloComComprado.setNombre(nombrePasajero);
					vueloComComprado.setCedula(cedulaPasajero);
					vueloComComprado.setCodigoTrabajo(codigoTrabajo);
					vueloComComprado.setDestino(destinoViaje);
					vueloComComprado.setFechaViaje(fechaDeViaje);
					vueloComComprado.setCodigoVuelo(codigoVuelo);

					vueloComercial.add(vueloComComprado);
					System.out.println("Compra del vuelo realizada exitosamente");
					System.out.println();
					System.out.println("Su codigo de vuelo es: "+codigoVuelo);
					System.out.println();

				} else if (tipoVuelo == 2) {
					
					VueloVacacional vueloVacComprado = new VueloVacacional();

					System.out.println("Se aplicará un descuento del 10% a su compra");
					System.out.println();
					System.out.println("Destinos de viaje disponibles: ");
					System.out.println();

					for (int i = 0; i < 8; i++) {
						System.out.println(destinos[i]);
					}
					System.out.println();
					System.out.println("Seleccione su destino: ");
					String destinoViaje = teclado2.nextLine();

					for (int i = 0; i < 8; i++) {

						Vuelo destinoComparar = destinos[i];
						String destinoExistente = destinoComparar.getDestino();
						boolean comparacion = (destinoExistente.equals(destinoViaje));

						if (comparacion == true) {
							int precioVuelo = destinoComparar.getPrecio();
							int descuento=(precioVuelo/10);
							int precioVueloFinal=precioVuelo-descuento;
							vueloVacComprado.setPrecio(precioVueloFinal);
							vueloVacComprado.setDescuento(descuento);
						}

					}
					System.out.println("Ingresar fecha de vuelo (año(aaaa); mes(mm); dia(dd)");
					int año = teclado4.nextInt();
					int mes = teclado4.nextInt();
					int dia = teclado4.nextInt();

					LocalDate fechaDeViaje = LocalDate.of(año, mes, dia);

					vueloVacComprado.setNombre(nombrePasajero);
					vueloVacComprado.setCedula(cedulaPasajero);
					vueloVacComprado.setDestino(destinoViaje);
					vueloVacComprado.setFechaViaje(fechaDeViaje);
					vueloVacComprado.setCodigoVuelo(codigoVuelo);

					vueloVacacional.add(vueloVacComprado);
					
					System.out.println("Compra del vuelo realizada exitosamente");
					System.out.println();
					System.out.println("Su codigo de vuelo es: "+codigoVuelo);
					System.out.println();
					
				} else {
					System.out.println("Opcion incorrecta: ");
				}

				break;
			case "2":
				System.out.println();
				System.out.println("Escribir código del vuelo: ");
				System.out.println();
				int codigoVueloEscrito=teclado5.nextInt();
				
				for (int i = 0; i < vueloComercial.size(); i++) {
					VueloComercial busquedaVuelo1=vueloComercial.get(i);
					int codigoVuelo1=busquedaVuelo1.getCodigoVuelo();
					
					if (codigoVueloEscrito==codigoVuelo1) {
						System.out.println();
						System.out.println("Datos del vuelo comprado: ");
						System.out.println();
						System.out.println(vueloComercial.get(i));
					}else {
						
					}
				}
				
				for (int i = 0; i < vueloVacacional.size(); i++) {
					VueloVacacional busquedaVuelo2=vueloVacacional.get(i);
					int codigoVuelo2=busquedaVuelo2.getCodigoVuelo();
					
					if (codigoVueloEscrito==codigoVuelo2) {
						System.out.println();
						System.out.println("Datos del vuelo comprado");
						System.out.println();
						System.out.println(vueloVacacional.get(i));
					}else {
					
					}
				}
				
				break;
			case "3":
				System.out.println("Saliendo del sistema: ");
				break;
			default:
				System.out.println("No se ha seleccionado ninguna opcion");
				break;
			}
		} while (!opcion.equals("3"));
	}
}
