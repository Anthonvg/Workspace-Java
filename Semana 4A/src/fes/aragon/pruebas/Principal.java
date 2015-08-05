package fes.aragon.pruebas;

import fes.aragon.Celular;
import fes.aragon.SistemaOperativo;
import fes.aragon.TarjetaMadre;

public class Principal {

	public static void main(String[] args) {
		TarjetaMadre tarjetaMadre = new TarjetaMadre(); 
		SistemaOperativo sistemaOperativo = new SistemaOperativo();
		Celular celular = new Celular();
		Celular celular2 = new Celular(tarjetaMadre, sistemaOperativo, 200.00, 1234566, "12v", "toch");
		System.out.println("El celular es el : "+ celular.imei+ " Tiene un sistema operativo de: "+ celular2.getSistemaOpertivo().getCompania() + "\n");
		//Set
		SistemaOperativo sistema1 = new SistemaOperativo("google", "202256asf",2009, 22563.00, "Consulte la pagina");
		celular.setSistemaOpertivo(sistema1);
		System.out.println("El año es : "+ celular.getSistemaOpertivo().ano);
		
		

	}

}
