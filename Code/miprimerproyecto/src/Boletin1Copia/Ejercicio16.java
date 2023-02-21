package Boletin1Copia;

import java.util.Scanner;

/*
Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
Mostrar su suma y cuantos hay mayores de 1000€.
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		double suma = 0;
		int contadorSalarioMayor = 0;

		while (contador < 10) {
			System.out.println("Introduce el salario");
			double salario = Double.valueOf(sc.nextLine());
			suma += salario;
			if (salario > 1000) {
				contadorSalarioMayor++;
			}contador++;
		}
		System.out.println(suma);
		System.out.println(contadorSalarioMayor);

	}

}
