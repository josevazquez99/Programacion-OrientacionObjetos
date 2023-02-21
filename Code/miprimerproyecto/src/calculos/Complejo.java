package calculos;

import java.util.Objects;

public class Complejo {
	
	private  double parteReal = 0.0;
	private  double parteImaginaria = 0.0;
	
	public Complejo() {
		super();
	}

	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	
	public Complejo Suma(Complejo com2) {
		double parteRealNueva=this.parteReal+com2.parteReal;
		double parteImagNueva=this.parteImaginaria+com2.parteImaginaria;
		return new Complejo(parteRealNueva,parteImagNueva);


	}
	public Complejo Resta(Complejo com2) {
		double parteRealNueva=this.parteReal-com2.parteReal;
		double parteImagNueva=this.parteImaginaria-com2.parteImaginaria;
		return new Complejo(parteRealNueva,parteImagNueva);

	}
	
	public String getMostrarInformacion(double parteReal,double parteImaginaria) {
		String resultado="";
		resultado=String.valueOf(this.parteReal)+ " , " + String.valueOf(this.parteImaginaria);
		return resultado;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return Double.doubleToLongBits(parteImaginaria) == Double.doubleToLongBits(other.parteImaginaria)
				&& Double.doubleToLongBits(parteReal) == Double.doubleToLongBits(other.parteReal);
	}


	
	
	
	

	

}
