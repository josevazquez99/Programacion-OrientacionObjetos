package calculos;

import java.util.Scanner;

public class MainComplejo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu;
		do {
			System.out.println("1. Sumar complejos: Debe solicitar dos números complejos y mostrar el\r\n"
					+ "resultado de la suma.\r\n"
					+ "2. Restar complejos: Debe solicitar dos número complejos y mostrar el\r\n"
					+ "resultado de la resta.\r\n" + "3. Salir");
			System.out.println("¿Que opcion desea?");
			menu = sc.nextLine();
			switch (menu) {
			case "1": {
				System.out.println("Introduzca la parte real del complejo 1");
				int parteReal=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del complejo 1");
				int parteImag=Integer.valueOf(sc.nextLine());
				Complejo com1=new Complejo(parteReal,parteImag);
				System.out.println("Introduzca la parte real del complejo 2");
				int parteReal1=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del complejo 2");
				int parteImag1=Integer.valueOf(sc.nextLine());
				Complejo com2=new Complejo(parteReal1,parteImag1);
				System.out.println(com1.Suma(com2));
				break;
			}
			case "2": {
				System.out.println("Introduzca la parte real del complejo 1");
				int parteReal=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del complejo 1");
				int parteImag=Integer.valueOf(sc.nextLine());
				Complejo com1=new Complejo(parteReal,parteImag);
				System.out.println("Introduzca la parte real del complejo 2");
				int parteReal1=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del complejo 2");
				int parteImag1=Integer.valueOf(sc.nextLine());
				Complejo com2=new Complejo(parteReal1,parteImag1);
				System.out.println(com1.Resta(com2));
				break;
			}
			default:
				System.out.println("Salir");
			}

		} while (!menu.equals("3"));

	}

}
