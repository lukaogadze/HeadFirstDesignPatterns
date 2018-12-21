package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return getBeverage().getDescription() + ", Milk";
	}

	public double cost() {
		return getBeverage().cost() + .10;
	}
}
