package games;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Nave {
	private String nave = "nave2.png";
	private int posicionx;
	private int posiciony;
	private int x;
	private int y;
	public int a;
	public int pBack;
	public int pBack2;
	private Image imagen;

	public Nave() {

	}

	public Nave(int a) {
		pBack = 985;
		pBack2 = 0;
		x = 400;
		y = 250;
		ImageIcon img = new ImageIcon(this.getClass().getResource(nave));
		imagen = img.getImage();
		
	}

	public void mover() {
		x += posicionx;
		y += posiciony;
		pBack = pBack+posicionx;
		pBack2 = pBack+posicionx;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagen() {
		return imagen;
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			posicionx = -3;
		}

		if (key == KeyEvent.VK_RIGHT) {
			posicionx = 3;
		}

		if (key == KeyEvent.VK_UP) {
			posiciony = -3;
		}

		if (key == KeyEvent.VK_DOWN) {
			posiciony = 3;
		}
	}

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			posicionx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			posicionx = 0;
		}

		if (key == KeyEvent.VK_UP) {
			posiciony = 0;
		}

		if (key == KeyEvent.VK_DOWN) {
			posiciony = 0;
		}
	}
}