package builderdemo;

import builderdemo.pinggiran.Keju;

public class PizzaKejuFactory extends PizzaFactory {
	
	public Pizza createPizza() {
		Pizza pizza = new Pizza();
		
		pizza.setPinggiran(new Keju());
		
		pizza.addTopping(new builderdemo.topping.Keju());
		pizza.addTopping(new builderdemo.topping.Keju());
		pizza.addTopping(new builderdemo.topping.Keju());
		
		return pizza;
	}
	
}
