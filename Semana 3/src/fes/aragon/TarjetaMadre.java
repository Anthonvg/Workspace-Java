package fes.aragon;

public class TarjetaMadre {	
	public double precio;
	private String modelo;
	private String fabricante; 
	private String puerto;
	private String tipoRam;
	
	public TarjetaMadre() {
		
	}

	public TarjetaMadre(double precio, String modelo, String fabricante,
			String puerto, String tipoRam) {
		this.precio = precio;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.puerto = puerto;
		this.tipoRam = tipoRam;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getTipoRam() {
		return tipoRam;
	}

	public void setTipoRam(String tipoRam) {
		this.tipoRam = tipoRam;
	}
	
	
}
