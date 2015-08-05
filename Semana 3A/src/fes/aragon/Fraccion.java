package fes.aragon;

public class Fraccion {
	public int numerador;
	public int denominador;
	private double decimal;
	
	
	public Fraccion(){
		this.numerador = 0;
		this.denominador = 1;
		this.decimal = this.numerador/this.denominador;
	} 
	public Fraccion(int numerador, int denominador){
		this.numerador=numerador;
		this.denominador=denominador;
		this.decimal=this.numerador/this.denominador;
	}

	public double getDecimal(){
		return this.decimal;
	}
	
	public String valor(){
		String valor=this.numerador+"/"+this.denominador;
		return valor;
	}
	
	@Override
	public String toString() {
		String resultado = this.numerador + "/" + this.denominador;			
		return resultado;
	}
	
	
	

}

