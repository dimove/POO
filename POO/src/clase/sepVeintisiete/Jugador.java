package clase.sepVeintisiete;

public class Jugador {
	private char color;
	public Jugador(char c) {
		this.color = c;
	}

	
	/**
	 * 	Pedir coordenadas al usuario, comprobar que son válidas y colocar en caso afirmativo
	 * */
	public void poner(Tablero tablero) {
		GestorIO gestor = new GestorIO();
		gestor.outln("Juega jugador " + color);
		Coordenada destino = new Coordenada();
		
		do{
			destino.leer("Coordenada Destino");
		}while(destino.valida());
		
		tablero.poner(destino, color);
	}

	/**
	 * 	Escribir que el jugador ha ganado
	 * */
	public void haGanado() {
		GestorIO gestor = new GestorIO();
		gestor.outln("Ha ganado el jugador " + color);
	}

	/**
	 * 	Pedir coordenadas origen al usuario, comprobar que son válidas,
	 * 	pedir coordenadas destino, comprobar que son válidas e intercambiar la ficha 
	 * */
	public void mover(Tablero tablero) {

		Coordenada origen = new Coordenada();
		
		do{
			origen.leer("Coordenada Origen");
		}while(origen.valida());
		
		tablero.quitar(origen);
		
		this.poner(tablero);
	}

}
