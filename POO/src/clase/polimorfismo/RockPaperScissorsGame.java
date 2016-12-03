package clase.polimorfismo;

public interface RockPaperScissorsGame extends ZeroSumGame {
	
	int wins (Paper paper);
	int wins (Rock rock);
	int wins (Scissors scissors);
	
}
