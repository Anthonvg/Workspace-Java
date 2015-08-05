package fes.aragon.pruebas;

import fes.aragon.Estudiante;

public class Principal {

	public static void main(String[] args) {
		Estudiante alumnoUno = new Estudiante();
		Estudiante alumnoDos = new Estudiante();
		
		
		alumnoUno.setNumeroCuenta(12355);
		alumnoUno.setNombre("Luis Antonio");
		alumnoUno.setApellidoPaterno("Garcia");
		alumnoUno.setApellidoMaterno("Vazquez");
		alumnoUno.setTelefono(46574);
		alumnoUno.setDireccion("Av.lopez");
		alumnoDos.setNombre("Luis Antonio");
		
		alumnoDos=alumnoUno;
		
		System.out.println("Numero de cuenta: "+ alumnoUno.getNumeroCuenta());
		System.out.println("Nombre: " + alumnoUno.getNombre());
		System.out.println("Apellido paterno: "+ alumnoUno.getApellidoPaterno());
		System.out.println("Apellido materno: "+ alumnoUno.getApellidoMaterno());
		System.out.println("Telefono: "+alumnoUno.getTelefono());
		System.out.println("Direccion: "+alumnoUno.getDireccion());
		
		System.out.println("Alumno Uno" + alumnoUno);
		System.out.println("Alumno Dos" + alumnoDos);
		System.out.println(alumnoDos.getNombre() + alumnoDos );
		System.out.println(alumnoUno.toString());
	}

}
