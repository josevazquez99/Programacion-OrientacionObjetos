package Boletin1Copia;

import java.util.Scanner;

/*
8. Método que pida 15 números y realice su suma.

 */
public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(sumaNumeros());

	}
	public static int sumaNumeros() {
		Scanner sc=new Scanner(System.in);
		int contador=0;
		int suma=0;
		while(contador<10) {
			System.out.println("Introduce un numero");
			int numero=Integer.valueOf(sc.nextLine());
			suma+=numero;
			contador++;
			
		}return suma;
	}
	

}
