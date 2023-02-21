package Boletin3Java;

public class Palindromo {

	public static void main(String[] args) {
		System.out.println(palindromo("a na"));

	}

	public static boolean palindromo(String cadena) {
		boolean palindromo = false;
		StringBuilder cadenaInvertida = new StringBuilder();
		for(int i=0;i<cadena.length();i++) {
			if(Character.isWhitespace(cadena.charAt(i))) {
				cadena=cadena.substring(0, i)+cadena.substring(i+1);
			}cadenaInvertida.append(cadena.substring(i, i+1));
		}if(cadena.equalsIgnoreCase(cadenaInvertida.toString())) {
			palindromo=true;
		}
		return palindromo;
	}

}
