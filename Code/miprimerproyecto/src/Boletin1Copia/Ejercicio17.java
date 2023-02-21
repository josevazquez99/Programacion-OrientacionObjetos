package Boletin1Copia;

import java.util.Scanner;

/*
Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula
sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,
8, 13, 21, 34, 55, 89, 144.

 */
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Cuantos quieres");
		int numero=Integer.valueOf(sc.nextLine());
		int num1=0;
		int num2=1;
		int suma=1;
		int contador=0;
		for(int i=1;i<=numero;i++){
			System.out.println(suma);
			suma=num1+num2;
			num1=num2;
			num2=suma;
		}
		
	}

}
