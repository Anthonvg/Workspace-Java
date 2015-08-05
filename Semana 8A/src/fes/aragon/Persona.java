package fes.aragon;

public class Persona {
	private String nombre;
	private String direccion;
	private String rfc;
	
	public Persona(Persona persona){
		this.nombre = persona.getNombre();
		this.direccion = persona.getDireccion();
		this.rfc = persona.getRfc();
	}
	
	public Persona(String nombre, String direccion, String rfc) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion
				+ ", rfc=" + rfc + "]";
	}
	
	

}
