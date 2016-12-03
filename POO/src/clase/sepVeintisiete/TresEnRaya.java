package clase.sepVeintisiete;

public class TresEnRaya {
	private Tablero tablero = new Tablero();
	private Jugador jugadores[] = new Jugador[2];
	private Turno turno = new Turno();
	
	public TresEnRaya(){
		jugadores[0] = new Jugador('X');
		jugadores[0] = new Jugador('O');
	}
	
	/**
	 * 	Se ponen 5 fichas en un tablero alternando jugador
	 * 	Comprobamos si hay 3 en raya.
	 * 	ponemos otra ficha y comprobamos si hay tres en raya
	 * 	mientras no haya tres en raya movemos las fichas alternativamente
	 * */
	public void jugar() {
		for(int i = 0; i < 5; i++){
			jugadores[turno.getActual()].poner(tablero);
			turno.cambiar();
		}
		
		if(tablero.hayTresEnRaya()){
			jugadores[turno.noToca()].haGanado();
		}else{
			
			jugadores[turno.getActual()].poner(tablero);
			tablero.mostrar();
			//if(tablero.hayTresEnRaya()){
				jugadores[turno.getActual()].haGanado();
			//}else{
				
			turno.cambiar();
			while(!tablero.hayTresEnRaya()){
				jugadores[turno.getActual()].mover(tablero);
				turno.cambiar();
			}
			jugadores[turno.noToca()].haGanado();
			//}
				
		}
	}

}
