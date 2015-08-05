package fes.aragon.swing.hilo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;
import fes.aragon.swing.ElementosPintar;


public class Lamina extends JPanel implements Runnable {
	ArrayList<ElementosPintar> componentes = 
			new ArrayList<ElementosPintar>();
	public Lamina() {
		this.setDoubleBuffered(true);
	}
	public void agregarElemento(ElementosPintar elemento) {
		componentes.add(elemento);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10;) {

			this.repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	protected void paintComponent(Graphics arg0) {
			// TODO Auto-generated method stub
		super.paintComponent(arg0);
		for (ElementosPintar salida : componentes) {
			salida.pintar(arg0);
		}
		arg0.dispose();
	}

}
