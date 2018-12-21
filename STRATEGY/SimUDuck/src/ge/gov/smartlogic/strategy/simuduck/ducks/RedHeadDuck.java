package ge.gov.smartlogic.strategy.simuduck.ducks;

import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.fly.FlyWithWings;
import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.quack.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		super(new FlyWithWings(), new Quack());
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
