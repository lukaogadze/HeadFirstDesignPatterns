package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments;

import ge.gov.smartlogic.decorator.starbuzz.beverages.BeverageSize;
import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
	private Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	protected Beverage getBeverage() {
		return beverage;
	}

	public abstract String getDescription();
	
	public BeverageSize getSize() {
		return beverage.getSize();
	}
}
