package Boletin3Java;

public class EjercicioLetrasPares {

	public static void main(String[] args) {
		System.out.println(LetrasPares("joselito"));
	}
	public static String LetrasPares(String cadena) {
		StringBuilder letrasPar=new StringBuilder();
		for(int i=0;i<=cadena.length();i++) {
			if(i<cadena.length()) {
			if(i%2==0) {
				letrasPar.append(cadena.charAt(i));
			}
		}}return letrasPar.toString();
	}

}
