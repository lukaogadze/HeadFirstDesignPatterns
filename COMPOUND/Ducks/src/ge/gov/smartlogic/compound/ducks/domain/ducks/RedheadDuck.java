package ge.gov.smartlogic.compound.ducks.domain.ducks;

import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observer;

/**
 * Created by loghadze on 20/12/2018.
 */
public class RedheadDuck implements Quackable {
    private final Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }


    @Override
    public String toString() {
        return "Redhead Duck";
    }
}
