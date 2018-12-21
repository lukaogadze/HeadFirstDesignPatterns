package ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas;

import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.salami.Pepperoni;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.cheeses.Cheese;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.clams.Clams;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.doughs.Dough;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.sauces.Sauce;
import ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas.ingredients.veggies.Veggies;

public abstract class Pizza {
	private String name;

	private Dough dough;
	private Sauce sauce;
	private Veggies veggies[];
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;


	protected void setDough(Dough dough) {
		this.dough = dough;
	}

	protected void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	protected void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	protected void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	protected void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	protected void setClam(Clams clam) {
		this.clam = clam;
	}


	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	private void appendIngredientIfItsValid(Object ingredient, StringBuffer stringBuffer) {
		if (ingredient != null) {
			stringBuffer.append(ingredient);
			stringBuffer.append("\n");
		}
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- ").append(name).append(" ----\n");
		appendIngredientIfItsValid(dough, result);
		appendIngredientIfItsValid(sauce, result);
		appendIngredientIfItsValid(cheese, result);
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		appendIngredientIfItsValid(clam, result);
		appendIngredientIfItsValid(pepperoni, result);
		return result.toString();
	}
}
