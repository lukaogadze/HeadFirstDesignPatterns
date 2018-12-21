package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		super("NY Style Sauce and Cheese Pizza", "Thin Crust Dough","Marinara Sauce");
 
		addTopping("Grated Reggiano Cheese");
	}
}
