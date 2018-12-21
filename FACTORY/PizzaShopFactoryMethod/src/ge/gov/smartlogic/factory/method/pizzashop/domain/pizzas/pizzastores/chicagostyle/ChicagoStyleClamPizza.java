package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		super("Chicago Style Clam Pizza","Extra Thick Crust Dough","Plum Tomato Sauce");
 
		addTopping("Shredded Mozzarella Cheese");
		addTopping("Frozen Clams from Chesapeake Bay");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
