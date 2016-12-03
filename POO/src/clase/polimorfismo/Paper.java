package clase.polimorfismo;

public class Paper extends Hands implements RockPaperScissorsGame{

	@Override
	public int wins(ZeroSumGame zeroSumGame) {
		RockPaperScissorsGame player = (RockPaperScissorsGame) zeroSumGame;
		
		return - (player.wins(this));
	}

	@Override
	public int wins(Paper paper) {
		return 1;
	}

	@Override
	public int wins(Rock rock) {
		return -1;
	}

	@Override
	public int wins(Scissors scissors) {
		return 0;
	}

}
