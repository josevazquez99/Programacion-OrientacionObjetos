package Boletin1Copia;

/*
Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(DiaAsignatura("Martes"));
		System.out.println(DiaAsignatura("Jueves"));

	}

	public static String DiaAsignatura(String dia) {
		String resultado = "";
		if (dia == "Lunes") {
			resultado = "Base";
		} else if (dia == "Martes") {
			resultado = "Programacion";
		} else if (dia == "Miercoles") {
			resultado = "Programacion";
		} else if (dia == "Jueves") {
			resultado = "Fol";
		}else if (dia == "Viernes") {
			resultado = "Programacion";
		}else {
			resultado="No hay clases";
		}
		return resultado;
	}

}
