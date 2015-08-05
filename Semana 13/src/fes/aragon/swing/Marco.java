package fes.aragon.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco extends JFrame {
	private Runnable laminaHilo;
	private Marco(){
		Toolkit herram = Toolkit.getDefaultToolkit();
		Dimension tamanoPanta = herram.getScreenSize();
		int altura = tamanoPanta.height;
		int anchura = tamanoPanta.width;
		this.setSize(600,600);
		this.setLocation(10, 10);
		this.setResizable(false);
		this.setTitle("Hilos");
		laminaHilo = new Lamina();
		add((JPanel)laminaHilo);
	}
	
	public void iniciar(){
		Thread hilo = new Thread(laminaHilo);
		hilo.start();
	}
	
	public static void main (String[] args) {
		Marco app = new Marco();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		app.iniciar();
	}
}
