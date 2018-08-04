package builderdemo;

import java.util.Vector;

public class PizzaBuilder {
	private Pinggiran pinggiran;
	private Vector<Topping> toppings = new Vector<Topping>();
	
	public PizzaBuilder setPinggiran(Pinggiran pinggiran) {
		this.pinggiran = pinggiran;
		return this;
	}
	
	public PizzaBuilder addTopping(Topping topping) {
		this.toppings.add(topping);
		return this;
	}
	
	public Pizza cook() {
		Pizza p = new Pizza();
		p.setPinggiran(pinggiran);
		for (Topping topping: toppings) {
			p.addTopping(topping);
		}
		return p;
	}
}
