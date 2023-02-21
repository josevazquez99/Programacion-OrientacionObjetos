package Boletin3Java;

public class EjercicioEmpieza {

	public static void main(String[] args) {
		System.out.println(startwith("Hola","Ho"));
	}
	public static boolean startwith(String cadena,String palabra) {
		return cadena.substring(0,palabra.length()).equals(palabra);
	}

}
