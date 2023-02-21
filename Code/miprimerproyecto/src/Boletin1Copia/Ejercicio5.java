package Boletin1Copia;
/*
Realiza un método que reciba una hora por parámetro y que muestre luego buenos
días, buenas tardes o buenas noches según corresponda. Se utilizarán los tramos
de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente, sólo teniendo en cuenta el valor
de las horas.

 */
public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(devolverTramosHoras(10.30));

	}
	public static String devolverTramosHoras(double hora) {
		String resultado="";
		if(hora>=6 && hora<=12) {
			resultado="Buenos dias ";
		}else if(hora>=13 && hora<=20) {
			resultado="Buenas tardes";
		}else {
			resultado="Buenas noches";
		}return resultado;
	}

}
