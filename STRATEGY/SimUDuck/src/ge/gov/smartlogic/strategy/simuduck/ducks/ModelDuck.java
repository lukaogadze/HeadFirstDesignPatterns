package ge.gov.smartlogic.strategy.simuduck.ducks;

import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.fly.FlyNoWay;
import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		super(new FlyNoWay(), new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
