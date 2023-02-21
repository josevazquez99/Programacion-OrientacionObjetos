package Boletin1Copia;

import java.util.Scanner;

/*
Realiza un programa que sume los 100 números siguientes a un número entero y
positivo introducido por teclado. Se debe comprobar que el dato introducido es
correcto (que es un número positivo).
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=Integer.valueOf(sc.nextLine());
		int contador=0;
		int suma=0;
		while(contador<100) {
			numero++;
			suma+=numero;
			contador++;
			
		}System.out.println(suma);

	}

}
