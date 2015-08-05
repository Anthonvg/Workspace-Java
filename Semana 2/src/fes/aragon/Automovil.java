package fes.aragon;

public class Automovil {
	private String motor;
	private int puertas;
	private int cilindros;
	private String caballos;
	private String transmision;
	private String frenos;
	private String marca;
	private String modelo;
	private String año;
	public int llantas;
	public String confort;
	public String kilometraje;

	public Automovil() { //constructor
		llantas=5;
	}
	public Automovil (int llantas){//constructor recibe entero
		this.llantas=llantas;
	}
	public Automovil (String marca,String modelo){//Constructor recibe 2 strings
		this.marca=marca;
		this.modelo=modelo;	
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getCilindros() {
		cilindros=6;
		return cilindros;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getCaballos() {
		return caballos;
	}
	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}
	
}
