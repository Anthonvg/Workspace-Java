package fes.aragon.pruebas;

import fes.aragon.Computadora;
import fes.aragon.Monitor;
import fes.aragon.TarjetaMadre;

public class Principal {

	public static void main(String[] args) {
		TarjetaMadre tarjeta = new TarjetaMadre(40.00, "Gigabite", "intel", "45", "duo");
		Monitor monitor = new Monitor(1500.00, "sony", "4k", "1024x960", "123abc", "6k");
		Computadora computadora = new Computadora(3000.00,"Lion");
		
		System.out.println(computadora.getSitemaOperativo());
		System.out.println(computadora.getTarjetaMadre());
		Monitor monitor2 = new Monitor(200.00, "intel", "rgba", "2024x1080", "Apc", "4k");
		computadora.setMonitor(monitor2);
		System.out.println(computadora.getMonitor().getColor());
		System.out.println(computadora.datos());
	}

}
