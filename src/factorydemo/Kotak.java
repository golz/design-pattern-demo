package factorydemo;

public class Kotak extends Bentuk2D {
	private Rectangle legacy;
	
	public Kotak(int panjang, int lebar) {
		super(panjang, lebar);
		legacy = new Rectangle(panjang, lebar);
	}

	@Override
	public double luas() {
		return legacy.area();
	}

}
