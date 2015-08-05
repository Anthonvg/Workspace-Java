package fes.aragon;


public class Circulo extends Punto {
	protected double radio;
	
	public Circulo(){
		
	}

	public Circulo(int X, int Y, double radio, int angulo) {
		x=X;
		this.y=Y;
		setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}
	

	public void setRadio(double radio) {
		this.radio = (radio<0.0?0.0:radio);
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
	
	@Override
	public String toString() {
		return ("Circulo: ("+x+" , "+y+")Radio:"+radio);
	}
	
}
