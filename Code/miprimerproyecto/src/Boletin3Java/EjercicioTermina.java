package Boletin3Java;

public class EjercicioTermina {

	public static void main(String[] args) {
		System.out.println(endwith("Adios", "os"));

	}
	public static boolean endwith(String cadena,String palabra) {
		return cadena.substring(cadena.length()-palabra.length()).equals(palabra);
	}

}
