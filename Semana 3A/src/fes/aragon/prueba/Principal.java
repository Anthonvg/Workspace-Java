package fes.aragon.prueba;

import fes.aragon.Fraccion;
import fes.aragon.Operaciones;

public class Principal {
	 public static void main(String[] args){
		 //Suma
		 Fraccion f1 = new Fraccion(5,4);
		 Fraccion f2 = new Fraccion(1,4);
		 //Resta
		 Fraccion f3 = new Fraccion(1,5);
		 Fraccion f4 = new Fraccion(1,6);
		 //Multiplicacion
		 Fraccion f5 = new Fraccion(1,4);
		 Fraccion f6 = new Fraccion(1,6);
		 
		 Operaciones operacion = new Operaciones(f1, f2);
		 operacion.suma();
		
		 Operaciones operacionDos = new Operaciones();
		 operacionDos.resta(); 
		 
		 Operaciones operacionTres = new Operaciones();
		 operacionTres.multiplicacion();
		
		 Operaciones operacionCuatro = new Operaciones(f3,f4);
		 operacionCuatro.multiplicacion();
		 
		  System.out.println("Esto es una suma: "+ operacion.getResultado().valor()); 
		  System.out.println("Esto es una multiplicacion"+"Se inicializa en 0: "+operacionTres.getResultado().valor()); 
		  System.out.println("Esta es la multiplicacion: "+ operacionTres.getResultado().valor());
		  System.out.println(f1.toString());
				  
	 }
}
