package fes.aragon;

public class Celular {
	private String sistemaOperativo;
	private String modelo;
	private String compania;
	private String memoria;
	private String procesador;
	private String pantalla;
	public double  costo;
	public int numeroTelefonico;
	public int imei;
	
	public Celular(){
		costo=300;
	}
	public Celular(double costo){
		this.costo=costo; 
	}
	public String getCompania() {
		compania="Google";
		return compania;
	}
	
	
}
