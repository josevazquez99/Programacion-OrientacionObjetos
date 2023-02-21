package Boletin1Copia;

import java.util.Scanner;

/*
Realiza un programa que pida números hasta que se teclee uno negativo y muestre
cuántos números se han introducido.

 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=1;
		int contador=0;
		while(numero>0) {
			System.out.println("Introduce un numero");
			numero=Integer.valueOf(sc.nextLine());
			contador+=1;
		}System.out.println(contador);
	}

}
