package fes.aragon.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LecturaObjeto {

	public static void main(String[] args) {
		try {
			File f = new File (System.getProperty("user.dir")+"/dat/Datos");
			FileInputStream fw = new FileInputStream(f);
			ObjectInputStream es = new ObjectInputStream(fw);
			Persona per = (Persona)es.readObject();
			System.out.println(per.getName());
			System.out.println(per.getEdad());
			es.close();
		} catch (FileNotFoundException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}

	}

}
