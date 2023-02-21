package Boletin3Java;

public class ComprobarDni {

	public static void main(String[] args) {
		System.out.println(esSeguro("47545311X"));

	}

	public static boolean esSeguro(String cadena) {
		boolean esSeguro=false;
		if(Character.isLetter(cadena.charAt(cadena.length()-1))) {
			esSeguro=true;
		}
		return esSeguro;

	}

}
