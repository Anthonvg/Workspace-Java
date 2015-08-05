package fes.aragon;

public class Empleado {
	private String nombre;
	private String apellidoPaterno;
	private Fecha fechaNacimiento;
	private Fecha fechaEntrada;
	
	public Empleado(String nombre, String apellidoPaterno,
			Fecha fechaNacimiento, Fecha fechaEntrada) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaEntrada = fechaEntrada;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public Fecha getFechaEntrada() {
		return fechaEntrada;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidoPaterno="
				+ apellidoPaterno + ", fechaNacimiento=" + fechaNacimiento.getFecha().getTime()
				+ ", fechaEntrada=" + fechaEntrada.getFecha().getTime() + "]";
	}
	
	
	
	

}

