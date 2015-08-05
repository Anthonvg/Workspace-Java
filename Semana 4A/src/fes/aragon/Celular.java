package fes.aragon;

public class Celular {
	private TarjetaMadre tarjetaMadre;
	private SistemaOperativo sistemaOpertivo;
	public double  costo = 5500.00;
	public int imei = 12345678;
	public String bateria = "12v";
	public String pantalla = "Touch";
	
	public Celular(){
		}
	public Celular (TarjetaMadre tarjetaMadre, SistemaOperativo sistemaOperativo, double costo, int imei, 
			String bateria, String pantalla){
		this.tarjetaMadre = tarjetaMadre;
		this.sistemaOpertivo = sistemaOperativo;
		this.costo = costo;
		this.imei = imei;
		this.bateria = bateria;
		this.pantalla = pantalla;
	}
	public TarjetaMadre getTarjetaMadre() {
		return tarjetaMadre;
	}
	public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
		this.tarjetaMadre = tarjetaMadre;
	}
	public SistemaOperativo getSistemaOpertivo() {
		return sistemaOpertivo;
	}
	public void setSistemaOpertivo(SistemaOperativo sistemaOpertivo) {
		this.sistemaOpertivo = sistemaOpertivo;
	}
}
