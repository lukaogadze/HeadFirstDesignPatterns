package ge.gov.smartlogic.compound.ducks.domain.ducks.composite;

import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observer;

import java.util.ArrayList;

/**
 * Created by loghadze on 20/12/2018.
 */
public class Flock implements Quackable {
    private final ArrayList<Quackable> quackables;

    public Flock() {
        quackables = new ArrayList<>();
    }

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    public void quack() {
        for (Quackable duck : quackables) {
            duck.quack();
        }
    }

    public void registerObserver(Observer observer) {
        for (Quackable duck : quackables) {
            duck.registerObserver(observer);
        }
    }

    public void notifyObservers() { }

    public String toString() {
        return "Flock of Ducks";
    }
}
