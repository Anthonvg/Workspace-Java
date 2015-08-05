package fes.aragon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//for (int i = 0; i < 3; i++) {
		int bandera=1;
		while(bandera==1){
			Scanner entrada = new Scanner (System.in);
			System.out.println("Dame un valor de 1 al 5");
			try{
			int valor = entrada.nextInt();
			//entrada.close();
			switch(valor){
				case 1: 
					System.out.println("El valor fue uno");
					break;
				case 2:
					System.out.println("El valor fue dos");
					break;
				case 3:
					System.out.println("El valor fue tres");
					break;
				case 4:
					System.out.println("El valor fue cuatro");
					break;
				case 5:
					System.out.println("El valor fue cinco");
					break;
				case 6:
					System.out.println("Salida");
					bandera=0;
					break;
				default:
					System.out.println("Valor fuera de rango");
					break;
					
			}
	
		}catch(InputMismatchException ex){
			//ex.printStackTrace();
			System.out.println("Valor invalido");
			}
	
		}
	}
}
