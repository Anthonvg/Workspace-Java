package fes.aragon;

public class TarjetaMadre {
	public double precio = 1200.00;
	private String modelo = "AMD";
	private String fabricante = "Google"; 
	private String capacidad = "4gb";
	private String puertos = "Sata";
	
	public TarjetaMadre(){
		
	}
	
	public TarjetaMadre (double precio, String modelo, String fabricante, String capacidad, String puertos){
		this.precio = precio;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.capacidad = capacidad;
		this.puertos = puertos;
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

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getPuertos() {
		return puertos;
	}

	public void setPuertos(String puertos) {
		this.puertos = puertos;
	}
	
	
	
}
