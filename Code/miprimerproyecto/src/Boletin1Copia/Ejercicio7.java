package Boletin1Copia;
/*
Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
while, iii) do-while en cada una de ellas:
a. Crea un método que muestre los números del 1 al 100
b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.

 */
public class Ejercicio7 {

	public static void main(String[] args) {
		int i=320;
		while(i>160) {
			i-=20;
			System.out.println(i);
		}

//		do {
//			i++;
//			System.out.println(i);
//			
//		} while (i<100);
//		for(i=100;i>=0;i--) {
//			System.out.println(i);
//		}
		
	}

}
