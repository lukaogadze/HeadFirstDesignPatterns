package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle.ChicagoStyleCheesePizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle.ChicagoStyleClamPizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle.ChicagoStylePepperoniPizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle.NYStyleCheesePizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle.NYStyleClamPizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle.NYStylePepperoniPizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle.NYStyleVeggiePizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle.ChicagoStyleVeggiePizza;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
