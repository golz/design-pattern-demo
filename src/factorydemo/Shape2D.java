package factorydemo;

public abstract class Shape2D {
	protected int width, height;

	public Shape2D(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public abstract double area();
}
