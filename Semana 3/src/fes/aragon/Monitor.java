package fes.aragon;

public class Monitor {
	public double precio;
	private String fabricante;
	private String color;
	private String tamano;
	private String controlador;
	private String resolucion;
	
	public Monitor(){
		
	}

	public Monitor(double precio, String fabricante, String color,
			String tamano, String controlador, String resolucion) {
		this.precio = precio;
		this.fabricante = fabricante;
		this.color = color;
		this.tamano = tamano;
		this.controlador = controlador;
		this.resolucion = resolucion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getControlador() {
		return controlador;
	}

	public void setControlador(String controlador) {
		this.controlador = controlador;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	
}
