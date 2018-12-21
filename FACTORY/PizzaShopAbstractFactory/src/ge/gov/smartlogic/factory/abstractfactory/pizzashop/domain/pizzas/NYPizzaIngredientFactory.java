package ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas;

import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.cheeses.Cheese;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.cheeses.ReggianoCheese;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.clams.Clams;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.clams.FreshClams;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.doughs.Dough;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.doughs.ThinCrustDough;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.salami.Pepperoni;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.salami.SlicedPepperoni;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.sauces.MarinaraSauce;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.sauces.Sauce;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Garlic;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Mushroom;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.RedPepper;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Veggies;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Onion;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
