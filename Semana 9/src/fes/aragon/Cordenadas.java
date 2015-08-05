package fes.aragon;

public class Cordenadas extends Circulo{
	private int angulo; 

	public Cordenadas() {
		
	}
	public Cordenadas(double radio, int angulo) {
		super(); 
		setRadio(radio);
		this.angulo= angulo;
		
	}

	public int getAngulo() {
		return angulo;
	}

	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}
	
	public double getCordenadaX(){
		return(Math.cos(angulo)*radio);
	}
	
	public double getCordenadaY(){
		return(Math.sin(angulo)*radio);
	}
	
	
}
