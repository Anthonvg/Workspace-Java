package fes.aragon.pruebas;

import fes.aragon.Empleado;

public class Principal {

	public static void main(String[] args) {
	
		System.out.println("---------------------------");
		Empleado empleado = new Empleado(120);
		System.out.println(Empleado.getIdSiguiente()+") "+empleado.toString());
		
		System.out.println("---------------------------");
		Empleado empleado2 = new Empleado(4);
		System.out.println(Empleado.getIdSiguiente()+") " + empleado2.toString());
		
		System.out.println("---------------------------");
		Empleado empleado3 = new Empleado(20);
		System.out.println(Empleado.getIdSiguiente()+") " + empleado3.toString());
		
		System.out.println("---------------------------");
		Empleado empleado4 = new Empleado(30);
		System.out.println(Empleado.getIdSiguiente()+") " + empleado4.toString());
		
		System.out.println("---------------------------");
		Empleado empleado5 = new Empleado(80);
		System.out.println(Empleado.getIdSiguiente()+") " + empleado5.toString());
		
		System.out.println("---------------------------");
		Empleado empleado6 = new Empleado(890);
		System.out.println(Empleado.getIdSiguiente()+") " + empleado6.toString());
		
		System.out.println("---------------------------");
		Empleado empleado7 = new Empleado(880);
		System.out.println(Empleado.getIdSiguiente()+") " + empleado7.toString());
		
		System.out.println("---------------------------");
		Empleado empleado8 = new Empleado();
		System.out.println(Empleado.getIdSiguiente()+") "+empleado8.toString()  );
		
		System.out.println("---------------------------");
		System.out.println("El area de un circulo es: "+Math.PI*Math.pow(2.0,2));
		System.out.println(Math.pow(2.0,3));
	}

}
