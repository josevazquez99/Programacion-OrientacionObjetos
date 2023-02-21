package Boletin1Copia;

import java.util.Scanner;

/*
. Realiza un programa que pida números y muestre su cuadrado, repitiendo el
proceso hasta que se introduzca un número negativo.

 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=1;
		double cuadrado=0;
		while(numero>=0) {
			System.out.println("Introduce un numero");
			numero=Integer.valueOf(sc.nextLine());
			cuadrado=Math.pow(numero, 2);
			System.out.println(cuadrado);
		}System.out.println("Termino");

	}

}
