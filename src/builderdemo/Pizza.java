package builderdemo;

import java.util.Iterator;
import java.util.Vector;

public class Pizza implements Cloneable {
	private Pinggiran pinggiran;
	private Vector<Topping> toppings = new Vector<Topping>();
	
	public Iterator createToppingIterator(){
		return toppings.iterator();
	}
	
	public Pizza() {
		System.out.println("pizza dimasak");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("pizza selesai dimasak");
	}
	
	@Override
	public Object clone()  {
		try{
			return super.clone();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Pinggiran getPinggiran() {
		return pinggiran;
	}
	
	public void setPinggiran(Pinggiran pinggiran) {
		this.pinggiran = pinggiran;
	}
	
	public Vector<Topping> getToppings() {
		return toppings;
	}
	
	public void addTopping(Topping topping) {
		this.toppings.add(topping);
	}
	
	
}
