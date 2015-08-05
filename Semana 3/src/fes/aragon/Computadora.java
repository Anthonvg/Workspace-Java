package fes.aragon;

public class Computadora {
	public double precio;
	private String sitemaOperativo;
	private Monitor monitor;
	private TarjetaMadre tarjetaMadre;

	public Computadora() {
	}

	public Computadora(double precio, String sitemaOperativo) {
		this.precio = precio;
		this.sitemaOperativo = sitemaOperativo;
		this.monitor = monitor;
		this.tarjetaMadre = tarjetaMadre;
	}

	public String getSitemaOperativo() {
		return sitemaOperativo;
	}

	public void setSitemaOperativo(String sitemaOperativo) {
		this.sitemaOperativo = sitemaOperativo;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public TarjetaMadre getTarjetaMadre() {
		return tarjetaMadre;
	}

	public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
		this.tarjetaMadre = tarjetaMadre;
	}

	public String datos() {
		String informacion = this.precio + "/n" + this.monitor.precio + "\n"
				+ this.tarjetaMadre.precio;
		return informacion;
	}

}
