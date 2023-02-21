package Boletin3Java;

public class Capicua {

	public static void main(String[] args) {
		System.out.println(esCapicua(11.11));
	}

	public static boolean esCapicua(double numero) {
		boolean capicua = false;
		String numeroCadena = numero + "";
		StringBuilder numeroInvertido = new StringBuilder();
		for (int i = numeroCadena.length() - 1; i >= 0; i--) {
			if (numeroCadena.charAt(i) == '.') {
				numeroCadena = numeroCadena.substring(0, i) + numeroCadena.substring(i + 1);
				i--;
			}
			numeroInvertido.append(numeroCadena.substring(i, i + 1));
		}
		if (numeroCadena.equals(numeroInvertido.toString())) {
			capicua = true;
		}
		return capicua;
	}

}
