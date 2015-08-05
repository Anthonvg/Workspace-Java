package fes.aragon.pruebas;

import java.io.ObjectInputStream.GetField;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import fes.aragon.Circulo;
import fes.aragon.Cordenadas;

public class Prueba {
	public static void main(String []args){
		//Locale local = new Locale("es","MX");
		//NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		Circulo circulo = new Circulo (5,6,2.54,56);
		//circulo.setX(-10);
		//System.out.println(circulo.getX());
		//DecimalFormat formato = (DecimalFormat)nf;
		DecimalFormat digitos = new DecimalFormat("0.00");
		

		
		//System.out.println(formato.format(circulo.getCircunferencia()));
		
		
		System.out.println("Diametro: "+digitos.format(circulo.getDiametro()));
		System.out.println("Area: "+digitos.format(circulo.getArea()));
		System.out.println("Circunferencia: "+digitos.format(circulo.getCircunferencia()));
		
		//Puntos de la circunferencia 
		Scanner datos = new Scanner(System.in);
		double radio;
		int grados;
		
		System.out.println("/*********************************************************");
		System.out.print("Introdusca el valor del radio: ");
		radio = datos.nextDouble();
		System.out.print("Introdusca el valor del angulo: ");
		grados = datos.nextInt();
		
		Cordenadas cordenada = new Cordenadas(radio,grados);
		System.out.println("("+digitos.format(cordenada.getCordenadaX())+" , "+ digitos.format(cordenada.getCordenadaY())+")");
	}
}
