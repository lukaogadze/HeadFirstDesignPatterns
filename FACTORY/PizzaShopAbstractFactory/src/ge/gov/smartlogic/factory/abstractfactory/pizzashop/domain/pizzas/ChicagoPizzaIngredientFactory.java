package ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas;

import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.cheeses.Cheese;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.doughs.ThickCrustDough;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.salami.Pepperoni;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.salami.SlicedPepperoni;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.sauces.PlumTomatoSauce;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.sauces.Sauce;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Spinach;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Veggies;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.BlackOlives;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.clams.Clams;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.doughs.Dough;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Eggplant;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.clams.FrozenClams;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.cheeses.MozzarellaCheese;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
