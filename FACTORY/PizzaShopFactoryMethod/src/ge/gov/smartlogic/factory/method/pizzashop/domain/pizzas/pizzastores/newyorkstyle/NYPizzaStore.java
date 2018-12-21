package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
