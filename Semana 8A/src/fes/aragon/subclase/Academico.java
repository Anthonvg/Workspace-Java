package fes.aragon.subclase;

import fes.aragon.Persona;

public class Academico extends Persona {
	private String numeroTrabajador;
	public Academico(String nombre, String direccion, String rfc, String numeroTrabajador){
		super(nombre,direccion,rfc);
		this.numeroTrabajador=numeroTrabajador;
	}
	public Academico(Persona persona,String numeroTrabajador){
		super(persona);
		this.numeroTrabajador=numeroTrabajador;
	}
	
	public String getNumeroTrabajador() {
		return numeroTrabajador;
	}
	public void setNumeroTrabajador(String numeroTrabajador) {
		this.numeroTrabajador = numeroTrabajador;
	}
	@Override
	public String toString() {
		return "Academico [numeroTrabajador=" + numeroTrabajador
				+ ", getNumeroTrabajador()=" + getNumeroTrabajador()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
