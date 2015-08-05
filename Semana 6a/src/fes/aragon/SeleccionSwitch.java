package fes.aragon;

import java.util.Scanner;

public class SeleccionSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dame una cadena");
		String valor = entrada.nextLine();
			switch (valor) {
			case "Hola":
			case "hola":
			case "HOLA":
				System.out.println("La cadena es Hola");
				break;
			case "Java":
			case "JAVA":
			case "java":	
				System.out.println("La cadena es Java");
				break;
			default:
				System.out.println("Cadena invalida");
				break;
			}
	}

}
