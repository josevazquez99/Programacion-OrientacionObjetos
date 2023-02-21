package Boletin3Java;

public class Invertir2 {

	public static void main(String[] args) {
		System.out.println(invertir2("Joselito"));

	}

	public static String invertir2(String cadena) {
		int cont=0;
		String cadenaInvertida="";
		while(cont<cadena.length()) {
			if(cont%2!=0) {
				cadenaInvertida+=String.valueOf(cadena.charAt(cont)+String.valueOf(cadena.charAt(cont-1)));
			}cont++;
		}return cadenaInvertida;

		
}}
