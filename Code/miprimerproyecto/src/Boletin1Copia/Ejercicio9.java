package Boletin1Copia;

import java.util.Scanner;

/*
9. Método que pida 5 números e imprima si alguno es múltiplo de 3.

 */
public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(esMultiplo());

	}
	public static String esMultiplo() {
		Scanner sc=new Scanner (System.in);
		String multiplos="";
		int contador=0;
		while (contador<5) {
			System.out.println("Introduce un numero");
			int numero=Integer.valueOf(sc.nextLine());
			if(numero%3==0) {
				multiplos += numero +" El numero es divisble por 3 " + "\n";
				
			}contador++;
		}return multiplos;
		
		
	}

}
