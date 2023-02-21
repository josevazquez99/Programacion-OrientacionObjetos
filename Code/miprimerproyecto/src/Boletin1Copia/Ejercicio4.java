package Boletin1Copia;

import java.util.Scanner;

/*
Calcular las calificaciones de un alumno con un método que reciba la nota de la
parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
deberá devolver un mensaje de error.
Realiza el método que calcule la media de tres notas y te devuelva la nota del
boletín (insuficiente, suficiente, bien, notable o sobresaliente).

 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce la nota practica");
		double notaPra=Double.valueOf(sc.nextLine());
		while(notaPra<0 || notaPra>10) {
			System.out.println("Introduce la nota practica correctamente");
			notaPra=Double.valueOf(sc.nextLine());

		}
		System.out.println("Introduce la nota problema");
		double notaPro=Double.valueOf(sc.nextLine());
		while(notaPro<0 || notaPro>10) {
			System.out.println("Introduce la nota problema correctamente");
			notaPro=Double.valueOf(sc.nextLine());

		}
		System.out.println("Introduce la nota teorica");
		double notaT=Double.valueOf(sc.nextLine());
		while(notaT<0 || notaT>10) {
			System.out.println("Introduce la nota teorica correctamente");
			notaT=Double.valueOf(sc.nextLine());

		}
		double notaFinal=0;
		notaFinal=notaPra*0.10+notaPro*0.5+notaT*0.4;
		System.out.println(notaFinal);
	}

}
