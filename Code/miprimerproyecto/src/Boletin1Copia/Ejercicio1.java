package Boletin1Copia;
/*
Realiza un método que reciba dos números y devuelva True si uno es múltiplo del
otro
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(esMultiplo(15,3));
	}
	public static boolean esMultiplo(int numero,int numero1) {
		boolean esMultiplo = false;
		if(numero%numero1==0) {
			esMultiplo=true;
		}return esMultiplo;
	}

}
