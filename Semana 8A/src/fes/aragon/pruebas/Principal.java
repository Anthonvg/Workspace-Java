package fes.aragon.pruebas;

import fes.aragon.Persona;
import fes.aragon.subclase.Academico;
import fes.aragon.subclase.Alumno;

public class Principal {

	public static void main(String[] args) {
		Alumno alumno = new Alumno("Antonio","Sin Direccion","daf","0001");
		System.out.println(alumno.toString());
		
		
		Persona persona = new Persona("Antonio","Sin numero","YYYYYAAA");
		Alumno alumnoDos = new Alumno (persona,"0002");
		System.out.println(alumnoDos.getDireccion());
		System.out.println(alumnoDos.getNumeroCuenta());
		
		Academico academico = new Academico (persona,"455264");
		System.out.println(academico.getRfc());
		System.out.println(academico.getNumeroTrabajador());
		
		Academico academicoDos = new Academico(persona, "45565");
		System.out.println(academicoDos.toString());
		
	}

}
