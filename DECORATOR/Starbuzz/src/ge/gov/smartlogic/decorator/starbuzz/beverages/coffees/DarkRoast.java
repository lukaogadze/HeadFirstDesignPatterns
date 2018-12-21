package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		setDescription("Dark Roast Coffee");
	}
 
	public double cost() {
		return .99;
	}
}

