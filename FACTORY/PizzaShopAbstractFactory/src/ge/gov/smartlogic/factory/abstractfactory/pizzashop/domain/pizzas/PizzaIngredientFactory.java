package ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas;

import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.salami.Pepperoni;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.cheeses.Cheese;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.clams.Clams;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.doughs.Dough;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.sauces.Sauce;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
