package fes.aragon;


public class Punto extends Object implements Figura {
	protected int x;
	protected int y;
	
	public Punto(){
		
	}
	
	public Punto(int x, int y){
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return ("(" + x + "," + y + ")");
	}

	public double getArea() {
		return 0.0;
	}

	public double getVolumen() {
		return 0.0;
	}

	public String getNombre() {
		return "Punto";
	}
	
}
