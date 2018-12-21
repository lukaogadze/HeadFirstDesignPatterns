package ge.gov.smartlogic.strategy.simuduck.ducks;

import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.fly.FlyNoWay;
import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		super(new FlyNoWay(), new Squeak());
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
