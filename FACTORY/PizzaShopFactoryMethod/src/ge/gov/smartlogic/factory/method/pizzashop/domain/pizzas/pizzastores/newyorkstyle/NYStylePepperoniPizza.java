package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		super("NY Style Pepperoni Pizza","Thin Crust Dough","Marinara Sauce");
 
		addTopping("Grated Reggiano Cheese");
		addTopping("Sliced Pepperoni");
		addTopping("Garlic");
		addTopping("Onion");
		addTopping("Mushrooms");
		addTopping("Red Pepper");
	}
}
