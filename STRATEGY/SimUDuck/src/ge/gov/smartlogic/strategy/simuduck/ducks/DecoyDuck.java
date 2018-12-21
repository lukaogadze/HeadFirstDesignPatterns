package ge.gov.smartlogic.strategy.simuduck.ducks;

import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.fly.FlyNoWay;
import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
