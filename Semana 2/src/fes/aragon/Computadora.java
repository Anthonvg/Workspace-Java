package fes.aragon;

public class Computadora {
	private String sistemaOperativo;
	private String memoriaRam;
	private String discoDuro;
	private String procesador;
	private String tarjetaVideo;
	private String tarjetaMadre;
	public 	double costo;
	public  String modelo;
	
	public Computadora () { //Esto es un constructor y va dentro del class
		costo=50.0;
	}
	public Computadora (double costo){
		this.costo=costo;
	}

	public String getModelo() { //Esto es un Get
		modelo="Macbook";
		return modelo;
	}
	
}