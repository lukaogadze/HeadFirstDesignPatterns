package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		setDescription("House Blend Coffee");
	}
 
	public double cost() {
		return .89;
	}
}

