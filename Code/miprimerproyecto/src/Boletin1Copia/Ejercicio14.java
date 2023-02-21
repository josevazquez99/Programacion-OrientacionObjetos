package Boletin1Copia;

import java.util.Scanner;

/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un
número negativo y nos diga cuántos números se han introducido, la media de los
impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
final de la introducción de datos pero no se incluye en el cómputo.

 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=0;
		int contador=0;
		int mayor=0;
		int contadorImpar=0;
		while(numero>=0) {
			System.out.println("Introduce un numero");
			numero=Integer.valueOf(sc.nextLine());
			if(numero%2==0 && numero>mayor) {
				mayor=numero;
			}
			if(numero%2!=0) {
				contadorImpar++;
				
			}
			contador++;


			
		}System.out.println("Has introducido " +(contador-1)+ " numeros positivos");
		System.out.println("El mayor es " + mayor);
		System.out.println("La media es " + contador/(contadorImpar-1) +  " de los impares" );


	}
	
}
