package fes.aragon;

import java.util.GregorianCalendar;

public class Fecha {
	private GregorianCalendar fecha;
	
	public Fecha (){
		this.fecha = new GregorianCalendar();
	}
	
	public Fecha (GregorianCalendar fecha){
		super();
		this.fecha = fecha;	
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}
	
	
}
