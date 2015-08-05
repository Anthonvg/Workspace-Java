package fes.aragon.swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Lamina extends JPanel implements Runnable{
	private double radioOrbita = 100;
	private int centro = 50;
	private double i = 0;
	private double j = 0;
	private double x = centro + (radioOrbita * Math.sin(i));
	private double y = centro + (radioOrbita * Math.cos(i));
	private double x1 = x;
	private double y1 = y;
	double grados = 0;
	ArrayList<Point2D> punto = new ArrayList<Point2D>();
	GeneralPath ruta = new GeneralPath();
	public Lamina(){
		ruta.moveTo(x, y);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			repaint();
			try{
				Thread.sleep(20);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		x = centro + (radioOrbita * Math.sin(Math.toRadians(i)));
		y = centro + (radioOrbita * Math.cos(Math.toRadians(j)));
		x1 = centro + (radioOrbita * Math.sin(Math.toRadians(i)));
		y1 = centro + (radioOrbita * Math.cos(Math.toRadians(j)));
		
		i+=5;
		j+=5.5;
		ruta.lineTo(x, y);
		ruta.lineTo(x1, y1);
		
		/*punto.add(new Point2D.Double(x,y));
		punto.add(new Point2D.Double(x1,y1));
		
		if (punto.size()>2) {
			for (int i=0; i<punto.size()-1;i++) {
				g2.drawLine((int)punto.get(i+1).getX(),
				(int)punto.get(i+1).getY(),
				(int)punto.get(i).getX(),
				(int)punto.get(i).getY());
			}
		}*/
	
		grados+=.01;
		g2.translate(300, 300);
		for (int i = 0; i < 10; i++) {
			
		
		g2.rotate(grados);
		g2.draw(ruta);
		}
	}

}
