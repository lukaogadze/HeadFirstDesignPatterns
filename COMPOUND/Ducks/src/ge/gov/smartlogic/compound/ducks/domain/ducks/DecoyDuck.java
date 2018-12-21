package ge.gov.smartlogic.compound.ducks.domain.ducks;

import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observer;

public class DecoyDuck implements Quackable {
	private final Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
