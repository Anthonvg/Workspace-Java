package fes.aragon.archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraArchivo {

	public static void main(String[] args) {
		try {
			File f = new File (System.getProperty("user.dir")+"/dat/Datos");
			FileWriter fw = new FileWriter(f,true);
			PrintWriter salida = new PrintWriter(fw);
			//for (int i = 0; i < 2000000; i++) {	
				salida.print("Salida4 ");
				salida.print("5565");
			//}
			salida.close();
			
		} catch (FileNotFoundException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
