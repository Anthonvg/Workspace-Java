package fes.aragon.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fes.aragon.swing.hilo.Musica;
import fes.aragon.swing.hilo.Lamina;

public class Marco extends JFrame {
	private Runnable laminaHilo;

	public Marco() {
		Toolkit herram = Toolkit.getDefaultToolkit();
		Dimension tamanoPanta = herram.getScreenSize();
		int altura = tamanoPanta.height;
		int anchura = tamanoPanta.width;
		this.setSize(600, 600);
		this.setLocation(10, 10);
		this.setResizable(false);		
		this.setTitle("Movimiento");
		laminaHilo = new Lamina();
		PintarPersonaje personajeUno = new PintarPersonaje("naomi",
				85,(JPanel) laminaHilo);
		
		((Lamina) laminaHilo).agregarElemento(personajeUno);
		
		((Lamina) laminaHilo).setFocusable(true);
		add((JPanel) laminaHilo);

	}

	public void pintar() {
		Thread hilo = new Thread(laminaHilo);
		hilo.start();
		Musica musica = new Musica();
		Thread hilo2 = new Thread(musica);
		hilo2.start();
	}

	public static void main(String[] args) {
		Marco app = new Marco();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		app.setVisible(true);
		app.pintar();

	}

}
