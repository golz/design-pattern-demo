package factorydemo;

public class Rectangle extends Shape2D {

	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public double area() {
		return width * height;
	}

}
