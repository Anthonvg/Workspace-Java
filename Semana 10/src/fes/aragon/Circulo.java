package fes.aragon;


public class Circulo extends Punto {
	protected double radio;
	
	public Circulo(){
		
	}

	public Circulo(int valorx, int valory, double radio, int angulo) {
		super(valorx,valory);
		setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}
	

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro(){
		return(2*radio);
	}
	public double getCircunferencia(){
		return(Math.PI*getDiametro());
	}

	public double getArea(){
		return (Math.PI*Math.pow(radio,2));
	}
	
	public String toString() {
		return ("Circulo: ("+x+" , "+y+")Radio:"+radio);
	}
	
	public String getNombre(){
		return "Circulo";
	}
	
}
