package geometria;

import java.util.Scanner;

public class MainRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangulo r = new Rectangulo();
		r.setanchura(-12.2);
		r.setlongitud(-12.2);
		System.out.println(r.calcularArea());
		System.out.println(r.calculaPerimetro());
	

	}
}
