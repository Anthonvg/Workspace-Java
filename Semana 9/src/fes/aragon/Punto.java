package fes.aragon;

public class Punto {
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
		if (x<0){
			this.x = 0;
		}else{
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
	
}
