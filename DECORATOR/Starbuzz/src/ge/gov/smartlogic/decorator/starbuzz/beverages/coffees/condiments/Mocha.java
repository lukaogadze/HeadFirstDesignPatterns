package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return getBeverage().getDescription() + ", Mocha";
	}
 
	public double cost() {
		return getBeverage().cost() + .20;
	}
}
