package clase.octVeinticinco;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radio) {
		System.out.println(toString() + radio);
	}
	
	@Override
	public String toString(){
		return "RedCircle - radius: ";
	}

}
