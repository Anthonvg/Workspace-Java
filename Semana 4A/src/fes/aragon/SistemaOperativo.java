package fes.aragon;

public class SistemaOperativo {
	private String compania = "Apple";
	private String version = "lion";
	public int ano;
	private double actualizacion = 10.256;
	public String informacion = "Para mas informacion consulte nuestra pagina"; 
	
	public SistemaOperativo (){
		this.ano = 1994;
	}
	
	
	public SistemaOperativo (String compania, String version, int ano, double actualizacion, String informacion){
		this.compania = compania;
		this.version = version;
		this.ano = ano;
		this.actualizacion = actualizacion;
		this.informacion = informacion; 
				
	}


	public String getCompania() {
		return compania;
	}


	public void setCompania(String compania) {
		this.compania = compania;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public double getActualizacion() {
		return actualizacion;
	}


	public void setActualizacion(double actualizacion) {
		this.actualizacion = actualizacion;
	}
	
	
}
