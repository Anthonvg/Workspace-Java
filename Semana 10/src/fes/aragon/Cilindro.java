package fes.aragon;


public class Cilindro extends Circulo {
	private double altura;
	
	public Cilindro(){
		
	}

	public Cilindro(int valorx, int valory, double radio, double altura){
		super(valorx,valory,radio);
		setAltura(altura);
	}

	public double getAltura() {
		return radio;
	}
	

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea(){
		return(2*super.getArea()+super.getCircunferencia()*getAltura());
	}
	public double getVolumen(){
		return(super.getArea()*getAltura());
	}
	
	
	public String toString() {
		return super.toString()+"; Altura= "+getAltura();
	}
	
	public String getNombre(){
		return "Cilindro";
	}
	
}
