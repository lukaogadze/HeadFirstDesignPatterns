package ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		super("NY Style Clam Pizza","Thin Crust Dough","Marinara Sauce");
 
		addTopping("Grated Reggiano Cheese");
		addTopping("Fresh Clams from Long Island Sound");
	}
}
