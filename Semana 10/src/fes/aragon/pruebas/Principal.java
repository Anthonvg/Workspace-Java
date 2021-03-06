package fes.aragon.pruebas;

import java.io.ObjectInputStream.GetField;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import fes.aragon.Circulo;
import fes.aragon.Figura;
import fes.aragon.Punto;
import fes.aragon.Cilindro;


public class Principal {
	public static void main(String []args){
		DecimalFormat dosDigitos = new DecimalFormat("0.00");
		Punto punto = new Punto (7,11);
		Circulo circulo = new Circulo(22,3,3.5, 0);
		Cilindro cilindro = new Cilindro (20,30,3.3,10.75);
		Figura[] arreglo = new Figura [3];
		arreglo[0]=punto;
		arreglo[1]=circulo;
		arreglo[2]=cilindro;
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Nombre:"+arreglo[i].getNombre());
			System.out.println("Area:"+dosDigitos.format(arreglo[i].getArea()));
			System.out.println("Volumen:"+dosDigitos.format(arreglo[i].getVolumen()));
			
		}
		
		
	}
}
