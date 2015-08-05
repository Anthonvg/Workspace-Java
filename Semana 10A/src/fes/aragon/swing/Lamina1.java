package fes.aragon.swing;

import java.awt.Graphics;

import javax.swing.JPanel;

import fes.aragon.figuras.Circulo;
import fes.aragon.figuras.Punto;

public class Lamina1 extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Circulo circulo = new Circulo(90,100,75,90);
		for (Punto salida:circulo.getCircunferencia()) {
			g.drawLine(300,300,salida.getX(),salida.getY());
			g.drawOval(salida.getX(), salida.getY(), 18, 18);
		}
		
		
		
	}

}
