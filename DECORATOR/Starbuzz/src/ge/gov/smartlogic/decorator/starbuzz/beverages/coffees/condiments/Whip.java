package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return getBeverage().getDescription() + ", Whip";
	}
 
	public double cost() {
		return getBeverage().cost() + .10;
	}
}
