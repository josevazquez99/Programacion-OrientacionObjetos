package Boletin2Copia;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(numeroReves(12));
	}
	public static int numeroReves(int numero) {
		int volteado=0;
		while(numero>0) {
			volteado=(volteado*10)+(numero%10);
			numero/=10;
		}return volteado;

	
}
}
