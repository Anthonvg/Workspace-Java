package fes.aragon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			int bandera = 1;
			while (bandera == 1) {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Dame una vocal");
				try {
					char valor = entrada.next().charAt(0);
					// entrada.close();
					switch (valor) {
					case 'a':
						System.out.println("La vocal fue a");
						break;
					case 'e':
						System.out.println("La vocal fue e");
						break;
					case 'i':
						System.out.println("La vocal fue i");
						break;
					case 'o':
						System.out.println("La vocal fue o");
						break;
					case 'u':
						System.out.println("La vocal fue u");
						break;
					default:
						System.out.println("Vocal incorrecta");
						bandera = 0;
						break;

					}

				} catch (InputMismatchException ex) {
					// ex.printStackTrace();
					System.out.println("Valor invalido");
				}

			}

		}
	}

}
