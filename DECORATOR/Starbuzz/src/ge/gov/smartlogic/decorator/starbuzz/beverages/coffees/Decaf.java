package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		setDescription("Decaf Coffee");
	}
 
	public double cost() {
		return 1.05;
	}
}

