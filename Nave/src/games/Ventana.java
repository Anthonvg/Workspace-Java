package games;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dibujar());
		
		setTitle("Nave");
		setBounds(10,10,300,250);
		setSize(1000, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args) {
        new Ventana();
    }
}