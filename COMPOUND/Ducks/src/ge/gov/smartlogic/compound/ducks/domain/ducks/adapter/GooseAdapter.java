package ge.gov.smartlogic.compound.ducks.domain.ducks.adapter;

import ge.gov.smartlogic.compound.ducks.domain.ducks.Goose;
import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observer;

/**
 * Created by loghadze on 20/12/2018.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    private final Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose pretending to be a Duck";
    }
}
