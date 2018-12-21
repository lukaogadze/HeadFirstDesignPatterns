package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		super("NY Style Veggie Pizza", "Thin Crust Dough", "Marinara Sauce");
 
		addTopping("Grated Reggiano Cheese");
		addTopping("Garlic");
		addTopping("Onion");
		addTopping("Mushrooms");
		addTopping("Red Pepper");
	}
}
