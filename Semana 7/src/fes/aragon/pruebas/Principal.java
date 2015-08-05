package fes.aragon.pruebas;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import fes.aragon.Empleado;
import fes.aragon.Fecha;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleado = new Empleado[3];
		empleado[0] = new Empleado ("Empleado 1", "Sin Apellido",
				new Fecha(new GregorianCalendar(2014,02,13)),
				new Fecha(new GregorianCalendar(1978,10,10)));
		
		empleado[1] = new Empleado ("Empleado 1", "Sin Apellido",
				new Fecha(new GregorianCalendar(1978,10,10)),
				new Fecha(new GregorianCalendar(1978,10,10))); 
		
		empleado[2] = new Empleado ("Empleado 1", "Sin Apellido",
				new Fecha(new GregorianCalendar(1978,10,10)),
				new Fecha(new GregorianCalendar(1978,10,10))); 
		
		//1.5 For Edge  
		for (Empleado salida:empleado){
			System.out.println(salida.toString());
			
		}
		ArrayList<Empleado> empleadoDos = new ArrayList<>(); //sintaxis nueva version 1.7 en adelante
		//ArrayList<Empleado> empleadoDos = new ArrayList<Empleado>(); // para versiones viejas
		for (int i = 0; i < 1000; i++) {
			empleadoDos.add(new Empleado("Empleado"+i, "Sin Apellido",
					new Fecha(new GregorianCalendar(1978,10,10)),
					new Fecha(new GregorianCalendar(1978,10,10))));	
		}
		
		for (Empleado salida:empleadoDos){
			System.out.println(salida.toString());
		
		}
		
	}
}
