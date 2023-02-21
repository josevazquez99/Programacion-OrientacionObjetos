package Boletin3Java;

public class Volteado {

	public static void main(String[] args) {
		System.out.println(volteado(21));

	}

	public static int volteado(int numero) {
		int volteado=0;
		while(numero>0) {
			volteado=(volteado*10)+(numero%10);
			numero/=10;
			}return volteado;

	}
}
