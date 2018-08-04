package lspdemo;

public class Square {
	protected int width;
	protected int height;

	public Square(int width, int height) {
		super();
		this.width = this.height = width;
	}
	
	public int area() {
		return width * width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
