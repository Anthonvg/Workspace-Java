package fes.aragon.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.ArrayList;

public class PintarPersonaje implements ElementosPintar{
	ArrayList<Image> imagenes = new ArrayList<Image>();
	MediaTracker tracker;
	int indice = 0;
	
	public PintarPersonaje(String nombreArchivo, int numeroFrames,
			Component componente){
		tracker = new MediaTracker(componente);
		Toolkit herram = Toolkit.getDefaultToolkit();
		for (int i = 1; i < numeroFrames; i++) {
			Image imagen = herram.getImage(getClass().getResource(
					"/fes/aragon/recursos/"+nombreArchivo+"/" +
			nombreArchivo + " (" + i
							+ ").png"));
			imagenes.add(imagen);
			tracker.addImage(imagen, i);

		}
		try {
			tracker.waitForAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void pintar(Graphics graficos) {
		// TODO Auto-generated method stub
		//super.paintComponent(graficos);
		Graphics2D gr2 = (Graphics2D) graficos;
		if (indice > imagenes.size() - 1) {
			indice = 0;
		}
		gr2.drawImage(imagenes.get(indice), 70, 320, null);
		indice++;
	}

	

}
