package fes.aragon;

public class Libreria {
	private String libreriaNombre;
	private String materias;
	private int numeroLibros;
	public int mesas;
	public String salas;
	public int sillas;
	public int personal;
	public int computadoras;
	
	public Libreria (){
		salas="ciencia";
	}
	public Libreria (String salas){
		this.salas=salas;
	}
	public String getLibreriaNombre() {
		this.libreriaNombre="Algarabia";
		return libreriaNombre;
	}
}
