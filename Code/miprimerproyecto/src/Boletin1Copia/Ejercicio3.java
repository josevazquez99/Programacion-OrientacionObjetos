package Boletin1Copia;

/*
Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
Debe devolver una de los siguientes mensajes según corresponda:
◦ Letra mayúscula
◦ Letra minúscula
◦ Dígito entre 0 y 9
◦ Signo de puntuación
◦ Espacio en blanco
◦ Paréntesis () o llaves {}
◦ Otro carácter
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(tipoCaracter('8'));
	}

	public static String tipoCaracter(char c) {
		String resultado = "";
		if (c > 97 && c <= 122) {
			resultado = "Letra minuscula";
		} else if (c > 65 && c <= 90) {
			resultado = "Letra mayuscula";
		} else if (c >= 48 && c <= 57) {
			resultado = "Es un digito";
		} else if (c==33) {
			resultado = "Es un signo de puntuacion";

		} else if (c == 32) {
			resultado = "Es un espacio en blanco";
		} else if (c == 40 || c == 41 || c == 123 || c == 125) {
			resultado = "Paréntesis () o llaves {}";

		} else {
			resultado = "Otro carácter";
		}
		return resultado;

	}

}
