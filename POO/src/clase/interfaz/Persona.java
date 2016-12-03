package clase.interfaz;

import java.io.Serializable;

public class Persona implements Comparable<Persona>, Cloneable, Serializable{
	
	/**
	 * 	Serializable: Para traducir el objeto para bits
	 * */
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, int edad){
		this.edad = edad;
	}
	
	/*@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString(){
		return nombre;
	}
}
