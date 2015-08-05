package fes.aragon.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marcos2 extends JFrame {
	public Marcos2(){
		//Dimenciones de pantalla
		Toolkit herramienta = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = herramienta.getScreenSize();
		int altura = tamanoPantalla.height;
		int anchura = tamanoPantalla.width;
		this.setSize(anchura/2,altura/2);
		this.setLocation(anchura/4,altura/4);
		Image img = herramienta.getImage("icon.png");
		this.setIconImage(img);
		this.setTitle("Programando con Swing");
		
		
	}

}
