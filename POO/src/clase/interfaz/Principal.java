package clase.interfaz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Pepe el mandril", 69);
		
		String fichero = "fichero.txt";
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
			
			oos.writeObject(persona);
			//oos.writeObject(persona.toString());
			
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			
			Persona per = (Persona) ois.readObject();
			
			System.out.println(per.toString());
			
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
