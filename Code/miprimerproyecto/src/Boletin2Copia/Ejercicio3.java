package Boletin2Copia;

public class Ejercicio3 {

	public static void main(String[] args) {
		String cadenaInvertida="";
		String cadena="joselito";
		int cont=0;
		while(cont<cadena.length()) {
			if(cont%2!=0) {
				cadenaInvertida+=String.valueOf(cadena.charAt(cont)+String.valueOf(cadena.charAt(cont-1)));
			}cont++;
		}System.out.println(cadenaInvertida);

	}
}
