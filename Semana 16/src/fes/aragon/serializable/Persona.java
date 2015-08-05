package fes.aragon.serializable;

import java.io.Serializable;

public class Persona implements Serializable{
	private String name;
	private int edad;
	
	public Persona(String nom, int ed) {
		this.name = nom;
		this.edad = ed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}		
}
