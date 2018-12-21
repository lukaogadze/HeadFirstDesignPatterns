package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		setDescription("Espresso");
	}
  
	public double cost() {
		return 1.99;
	}
}

