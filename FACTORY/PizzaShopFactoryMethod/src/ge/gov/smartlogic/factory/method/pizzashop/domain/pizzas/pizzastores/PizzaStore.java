package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public abstract class PizzaStore {
 
	public abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
