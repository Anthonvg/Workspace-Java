package fes.aragon;

public class Alcance {
	private int x=10;
	public void alcance(){
		int x=20;
		System.out.println("valor de x es: " + x);
		verCampo();
	}
	private void verCampo(){
		System.out.println("El valor del campo es: "+x);
	}
}
	