package factorydemo;

public class ShapeFactory {
	
	public static Shape2D createShape(String type, int w, int h) {
		if( "Triangle".equalsIgnoreCase(type) ){
			return new Triangle(w, h);
		}
		if( "Rectangle".equalsIgnoreCase(type) ){
			return new Rectangle(w, h);
		}
		return null;
	}
}
