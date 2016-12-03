package clase.octVeinticinco;

public class DrawableCircle extends DrawableShape{
	private int radio;
	public DrawableCircle(DrawAPI drawAPI, int radio) {
		super(drawAPI);
		// TODO Auto-generated constructor stub
		this.radio = radio;
	}

	@Override
	void draw() {
		drawAPI.drawCircle(radio);
	}

}
