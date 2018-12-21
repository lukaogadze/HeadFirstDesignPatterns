package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		super("Chicago Style Pepperoni Pizza","Extra Thick Crust Dough","Plum Tomato Sauce");
 
		addTopping("Shredded Mozzarella Cheese");
		addTopping("Black Olives");
		addTopping("Spinach");
		addTopping("Eggplant");
		addTopping("Sliced Pepperoni");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
