package ge.gov.smartlogic.compound.ducks.domain.ducks.observer;

import java.util.ArrayList;

/**
 * Created by loghadze on 21/12/2018.
 */
public class Observable implements Subject {
    private final ArrayList<Observer> subjects;
    private final Subject subject;

    public Observable(Subject subject) {
        this.subject = subject;
        this.subjects = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        subjects.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subjects) {
            observer.update(subject);
        }
    }
}
