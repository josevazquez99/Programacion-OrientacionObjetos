package Boletin1Copia;

import java.util.Scanner;

/*
Crea un programa que permita sumar N números. El usuario decide cuándo termina
de introducir números al indicar la palabra ‘fin’.

 */
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=0;
		String valorIntroducido="";
		int suma=0;
		while(!valorIntroducido.equals("fin")) {
			System.out.println("Introduce un numero");
			valorIntroducido=sc.nextLine();
			if(!valorIntroducido.equals("fin")) {
				numero=Integer.valueOf(valorIntroducido);
				suma+=numero;
			}
		}System.out.println(suma);
		
		
		
	}

}
