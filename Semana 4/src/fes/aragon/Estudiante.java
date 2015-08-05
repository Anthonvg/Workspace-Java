package fes.aragon;

public class Estudiante {
	
	private long numeroCuenta;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private long telefono;
	private String direccion;
	
	public Estudiante() {
		numeroCuenta=00;
		nombre="sin nombre";
		apellidoPaterno="Sin apellido paterno";
		apellidoMaterno="Sin apellido materno";
		telefono=00;
		direccion="Sin direccion";
	}

	public long getNumeroCuenta() { 
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		 String cadena = "Nombre: " + this.nombre + "\n"+
				 "Numero de Cuenta: " + this.numeroCuenta;
		return cadena;
	}
	
	
}
