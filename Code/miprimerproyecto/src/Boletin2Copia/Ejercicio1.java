package Boletin2Copia;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(numeroSoluciones(6, -5, 1));
	}
	public static String numeroSoluciones(int a,int b,int c) {
		double resultado1=((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		double resultado2=((-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		return "El resultado es " + resultado1 + " y " + resultado2;
	}

}
