package MockExam;

import java.util.Scanner;

public class Ejercicio1 {

	public static final int PRECIOGENERAL = 8;
	public static final int DIAESPECTADOR = 5;
	public static final double PRECIOPORPAREJA = 5.5;
	public static final String DIASEMANA = "LMXJVSD";
	public static final String TARJETA = "SN";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precioTotal = 0.0;
		int entrada = -1;
		while (entrada != 0) {
			do {
				System.out.println("Número de entradas:");
				entrada = Integer.valueOf(sc.nextLine());
			} while (entrada < 0);

			String dia = "";
			do {
				System.out.println("Día de la semana (L,M,X,J,V,S,D):");
				dia = sc.nextLine();
			} while (DIASEMANA.toLowerCase().indexOf(dia.toLowerCase()) == -1);

			String tarjeta = "";

			do {
				System.out.println("¿Tienes tarjeta CineJacaranda(S/N)?");
				tarjeta = sc.nextLine();
			} while (TARJETA.toLowerCase().indexOf(tarjeta.toLowerCase()) == -1);

			if (dia.equalsIgnoreCase("x")) {
				precioTotal = DIAESPECTADOR * entrada;

			} else if (dia.equalsIgnoreCase("J")) {
				if (entrada % 2 == 0) {
					precioTotal = PRECIOPORPAREJA * entrada;
				} else {
					precioTotal = PRECIOPORPAREJA * (entrada - 1) + PRECIOGENERAL;
				}
			} else {
				precioTotal = PRECIOGENERAL * entrada;
			}
			if (tarjeta.equalsIgnoreCase("s")) {
				precioTotal = precioTotal * 0.9;
			}
			System.out.println("El precio de su compra es " + precioTotal + " euros ");

		}
		sc.close();
	}
}
