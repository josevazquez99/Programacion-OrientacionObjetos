package Boletin1Copia;

/*
 Programar un sistema de calefacción-refrigeración que compruebe en función del
día y el mes, la estación en la que estamos y dependiendo de la estación programe
la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
El método deberá recibir como parámetro el mes y el día actual y devolver los
grados a los que deberemos programar el sistema.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(devolverTemperatura(22, "Diciembre"));

	}

	public static String devolverTemperatura(int dia, String mes) {
		String resultado = "";
		if (dia > 20 && mes == "Marzo" || dia < 20 && mes == "Junio") {
			resultado = "Primavera";
		} else if (dia >= 21 && mes == "Junio" || dia < 23 && mes == "Septiembre") {
			resultado = "Verano";
		} else if (dia >= 23 && mes == "Septiembre" || dia < 21 && mes == "Diciembre") {
			resultado = "Otoño";
		} else {
			resultado = "Invierno";
		}
		return resultado;

	}

}
