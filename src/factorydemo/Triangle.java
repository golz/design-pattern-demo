package factorydemo;

public class Triangle extends Shape2D {

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public double area() {
		return width * height * 0.5;
	}

}
