package geometria;

public class Rectangulo {

	private double longitud;
	private double anchura;

	public Rectangulo(double longitud, double anchura) {
		this.longitud = longitud;
		this.anchura = anchura;
	}

	public Rectangulo() {
		this.longitud = 1;
		this.anchura = 1;
	}
	public double getlongitud() {
		return longitud;
	}

	public double getanchura() {
		return anchura;
	}

	public void setlongitud(double longitud) {
		if (longitud > 0.0 && longitud < 20.0) {
			this.longitud = longitud;
		} else {
			System.out.println("la longitud debe debe de ser > 0 < 20.0");
			;
		}
	}

	public void setanchura(double anchura) {
		if (anchura > 0.0 && longitud < 20.0) {
			this.anchura = anchura;
		} else {
			System.out.println("la Anchura debe debe de ser > 0 < 20.0");
			;
		}
	}
	///////////////////////////
	public double calcularArea() {
		return anchura * longitud;
	}

	public double calculaPerimetro() {
        return (2 * anchura) + (2 * longitud);
    }
}