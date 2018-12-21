package ge.gov.smartlogic.compound.ducks.domain.ducks.decorator;

import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Observer;

/**
 * Created by loghadze on 20/12/2018.
 */
public class QuackCounter implements Quackable {
    private final Quackable quackable;
    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }

    @Override
    public String toString() {
        return quackable.toString();
    }
}
