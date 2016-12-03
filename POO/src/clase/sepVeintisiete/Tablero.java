package clase.sepVeintisiete;

public class Tablero {
	private char casillas[][];
	private final char VACIO = '-';
	// Para testear si hay tres en raya sumar las 3 coordenadas y si resulta 15 habrá
	private final int magicSquare [][] = new int[][] {
		new int [] {4, 9, 2},
		new int [] {3, 5, 7},
		new int [] {8, 1, 6}
	};
	private int jugador1;
	
	public Tablero(){
		casillas = new char [3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				casillas[i][j] = VACIO;
			}
		}
	}

	public boolean hayTresEnRaya() {
		
		
		for(int i = 0; i < casillas.length; i++){
			for(int j = 0; j < casillas[i].length; j++){
				if(casillas[i][j] == 'X')
					jugador1 += magicSquare[i][j];
			}
		}
		
		return false;
	}

	public void mostrar() {
		GestorIO gestor = new GestorIO();
		
		for(char [] casillas : casillas){
			gestor.outln("\n");
			for(char c : casillas){
				gestor.outln("" + c);
			}
		}
	}

	public void poner(Coordenada destino, char color) {
		// TODO Auto-generated method stub
		
	}

	public void quitar(Coordenada origen) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean mismoColor(Coordenada coordenada, char color){
		return false;
	}

}
