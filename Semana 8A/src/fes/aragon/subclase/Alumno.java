package fes.aragon.subclase;

import fes.aragon.Persona;

public class Alumno extends Persona {
	private String numeroCuenta;
	public Alumno(String nombre, String direccion, String rfc, String numeroCuenta){
		super(nombre,direccion,rfc);
		this.numeroCuenta=numeroCuenta;
	}
	/*public Alumno(Persona persona,String numeroCuenta){
		super(persona.getNombre(),persona.getDireccion(),persona.getRfc());
		this.numeroCuenta=numeroCuenta;
				
	}*/
	public Alumno(Persona persona,String numeroCuenta){
		super(persona);
		this.numeroCuenta=numeroCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	@Override
	public String toString() {
		return "Alumno [numeroCuenta=" + numeroCuenta + "]" + super.toString();
	}
	
}
