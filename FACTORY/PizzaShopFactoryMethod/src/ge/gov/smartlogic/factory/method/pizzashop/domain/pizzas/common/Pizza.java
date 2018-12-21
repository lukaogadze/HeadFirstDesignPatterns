package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common;

import java.util.ArrayList;

public abstract class Pizza {
	private final String name;
	private final String dough;
	private final String sauce;
	private final ArrayList<String> toppings;

	protected Pizza(String name, String dough, String sauce) {
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		toppings = new ArrayList<>();
	}

	protected void addTopping(String topping) {
		this.toppings.add(topping);
	}
 
	public void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
  
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	public void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

 
 
