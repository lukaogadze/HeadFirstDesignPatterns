package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		super("Chicago Deep Dish Veggie Pizza", "Extra Thick Crust Dough", "Plum Tomato Sauce");
 
		addTopping("Shredded Mozzarella Cheese");
		addTopping("Black Olives");
		addTopping("Spinach");
		addTopping("Eggplant");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
