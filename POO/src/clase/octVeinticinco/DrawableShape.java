package clase.octVeinticinco;

public abstract class DrawableShape{
	protected DrawAPI drawAPI;
	
	public DrawableShape(DrawAPI drawAPI) {
		super();
		this.drawAPI = drawAPI;
	}

	abstract void draw();
}
