package lspdemo;

public class Rectangle extends Square {

	public Rectangle(int width, int height) {
		super(width, height);
		this.height = height;
	}
		
	public int area() {
		return width * height;
	}
}
