package fes.aragon;

public class Principal {

	public static void main(String[] args) { //Esto es el menu principal
		
		Computadora computadora1 = new Computadora();
		Computadora computadora2 = new Computadora(60000.00);
		
		Celular celular1 = new Celular();
		Celular celular2 = new Celular(100.00);
		
		Automovil automovil1 = new Automovil();
		Automovil automovil2 = new Automovil(4);
		Automovil automovil3 = new Automovil("Dodge","403");//Constructor de varios Strings
		
		Libreria libreria1 = new Libreria();
		Libreria libreria2 = new Libreria("tecnologia");
		
		
		//Impresion en pantalla
		System.out.println("-----Class Computadora----------");
		System.out.println("Precio computadora 1: "+computadora1.costo);
		System.out.println("Precio computadora 2: "+computadora2.costo);
		System.out.println("Modelo: "+computadora1.getModelo());//Metodo get para atributos private
		
		System.out.println("-----Class Celular--------------");
		System.out.println("Costo celular1: "+celular1.costo);
		System.out.println("Costo celular2: "+celular2.costo);
		System.out.println("Compa�ia: "+celular1.getCompania());//salto de linea \n concatenando
		
		System.out.println("-----Class Automovil------------");
		System.out.println("Llantas automovil1: "+automovil1.llantas);
		System.out.println("Llantas automovil2: "+automovil2.llantas);
		System.out.println("Cilindros: "+automovil1.getCilindros());
		System.out.println("La marca es: "+  automovil3.getMarca()+"\n"+"El modelo es: "+automovil3.getModelo());
		
		System.out.println("-----Class Libreria------------");
		System.out.println("Sala importante libreria1: "+libreria1.salas);
		System.out.println("Sala importante libreria2: "+libreria2.salas);
		System.out.println("Nombre de libreria 1: "+libreria1.getLibreriaNombre());

		System.out.println("-----Metodo get y set------------");
		System.out.println(automovil1.getCaballos());
		automovil1.setCaballos("150 HP");
		System.out.println(automovil1.getCaballos());
	}

}