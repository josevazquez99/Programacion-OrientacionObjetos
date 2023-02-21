package Boletin1Copia;

import java.util.Scanner;

/*
Programa que reciba 10 números y nos indique el valor máximo y mínimo.

 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int mayor=0;
		int menor=0;
		int contador=0;
		mayor=mayor;
		menor=menor;
		
		while(contador<10) {
			System.out.println("Introduce un numero");
			int numero=Integer.valueOf(sc.nextLine());
			if(numero>mayor) {
				mayor=numero;
			}
			if(numero<menor) {
				menor=numero;
			}
			contador++;
			
		}System.out.println(mayor);
		System.out.println(menor);

	}

}
