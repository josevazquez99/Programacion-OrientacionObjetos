package cuentaCorriente;

import java.util.Scanner;

public class MainCuentaCorriente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu;
		int retiro;
		int ingreso;
		int contIngreso = 0;
		int contReintegro = 0;
		CuentaCorriente c = new CuentaCorriente(125);
		do {
			System.out.println("""
					1. Hacer un reintegro, se pedirá la cantidad a retirar.
					2. Hacer un ingreso, se pedirá la cantidad a ingresar.
					3. Consultar el saldo y el número de reintegros e ingresos realizados.
					4. Finalizar las operaciones. Debe confirmar si realmente desea salir e
					informar del saldo al final de todas las operaciones""");
			menu = sc.nextLine();
			switch (menu) {

			case "1" -> {
				System.out.println("Introduzca la cantidad a retirar");
				retiro = Integer.valueOf(sc.nextLine());
				c.setReintegro(retiro);
				System.out.println(c.getSaldoCuenta());
				contReintegro++;

			}

			case "2" -> {

				System.out.println("Introduzca el ingreso");
				ingreso = Integer.valueOf(sc.nextLine());
				c.setIngreso(ingreso);
				contIngreso++;
				System.out.println(c.getSaldoCuenta());

			}
			case "3" -> {
				System.out.println(c.getSaldoCuenta());
				System.out.println("Has echo " + contIngreso + " ingresos");
				System.out.println("Has echo " + contReintegro + " reintegros");

			}

			}
		} while (!menu.equals("4"));
		System.out.println(c.getSaldoCuenta());
	}
}
