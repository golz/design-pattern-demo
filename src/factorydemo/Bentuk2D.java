package factorydemo;

public abstract class Bentuk2D {
	public int panjang, lebar;
		
	public Bentuk2D(int panjang, int lebar) {
		super();
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public abstract double luas();
}
