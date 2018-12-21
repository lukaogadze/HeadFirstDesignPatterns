package ge.gov.smartlogic.strategy.simuduck.ducks.behavior.quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
