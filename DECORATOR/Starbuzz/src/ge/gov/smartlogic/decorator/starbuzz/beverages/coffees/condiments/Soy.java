package ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments;

import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;
import ge.gov.smartlogic.decorator.starbuzz.beverages.BeverageSize;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return getBeverage().getDescription() + ", Soy";
	}

	public double cost() {
		double cost = getBeverage().cost();
		if (getBeverage().getSize() == BeverageSize.TALL) {
			cost += .10;
		} else if (getBeverage().getSize() == BeverageSize.GRANDE) {
			cost += .15;
		} else if (getBeverage().getSize() == BeverageSize.VENTI) {
			cost += .20;
		}
		return cost;
	}
}
