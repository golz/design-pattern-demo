package builderdemo;

import builderdemo.pinggiran.Sosis;

public class PizzaSosisFactory extends PizzaFactory {

	public Pizza createPizza() {
		Pizza pizza = new Pizza();
		
		pizza.setPinggiran(new Sosis());
		
		pizza.addTopping(new builderdemo.topping.Sosis());
		pizza.addTopping(new builderdemo.topping.Sosis());
		pizza.addTopping(new builderdemo.topping.Keju());
		
		return pizza;
	}
	
}
