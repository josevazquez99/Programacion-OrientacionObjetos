package Boletin3Java;

public class EjercicioContiene {

	public static void main(String[] args) {
		System.out.println(contiene("Hola jose", "jose"));

	}

	public static int contiene(String cadena, String palabra) {
		boolean contiene = false;
		int cont = 0;
		int coincidencia=0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == palabra.charAt(cont)) {
				cont++;
			}else {
				cont=0;
			}
		}
		if (cont == palabra.length()) {
			contiene = true;
			coincidencia++;
			
		}
		return coincidencia;

	}
}
