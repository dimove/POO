package clase.polimorfismo;

import java.util.ArrayList;

public class TwoPlayersGame extends ArrayList<ZeroSumGame>{
	
	public TwoPlayersGame(){
		for(int i = 0; i < 100; i++){
			int randomNumber = (int)(Math.random()*3);
			
			switch (randomNumber) {
			case 0:
				createRock();
				break;
			case 1:
				createPaper();
				break;
			case 2:
				createScissors();
				break;
			default:
				break;
			}
			
		}
	}

	private void createScissors() {
		this.add(new Scissors());
	}

	private void createPaper() {
		this.add(new Paper());
	}

	private void createRock() {
		this.add(new Rock());
	}
	
	public void randomPlay(){
		ZeroSumGame firstPlayer = chooseRandom();
		
		ZeroSumGame secondPlayer = chooseRandom();
		
		System.out.println(firstPlayer.wins(secondPlayer));
	}
	
	public ZeroSumGame chooseRandom(){
		int randomItem = (int)(Math.random()*100);
		return this.get(randomItem);
				
	}
}
