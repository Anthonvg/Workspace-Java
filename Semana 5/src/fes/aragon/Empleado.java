package fes.aragon;

public class Empleado {
	
	private int id;
	private static int idSiguiente=1000000000;
	
	public Empleado(){
		super();
		Empleado.idSiguiente = 100;
	}
	public Empleado(int id){
		super();
		this.id=id;
		Empleado.idSiguiente=Empleado.idSiguiente+1;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public static int getIdSiguiente(){
		return idSiguiente;
	}
	@Override
	public String toString() {
		String cadena = "Empleado id: "+id; 
		return cadena;
	}
	
	
}
