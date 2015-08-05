package games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Dibujar extends JPanel implements ActionListener{
	private Nave nave;
	private Timer timer;
	
	public Dibujar() {
		
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(new teclado());

		nave = new Nave(1);
		timer = new Timer(5, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("bg.png"));
		if ((nave.getX()-900) % 2400 == 0)
			nave.pBack2 = 0;
		if ((nave.getX()-1900) % 2400 == 0)
			nave.pBack = 0;
			g.drawImage(imagenFondo.getImage(),985-nave.pBack,0,1100,600,null);
		if (nave.getX() >= 990)
		g.drawImage(imagenFondo.getImage(),985-nave.pBack,0,1500,600,null);
		
		g2.drawImage(nave.getImagen(), nave.getX(), nave.getY(), null);
	}

	public void actionPerformed(ActionEvent e) {

		nave.mover();
		repaint();
	}

	private class teclado extends KeyAdapter {

		public void keyReleased(KeyEvent e) {
			nave.keyReleased(e);

		}

		public void keyPressed(KeyEvent e) {
			nave.keyPressed(e);
			
		}
	}

}