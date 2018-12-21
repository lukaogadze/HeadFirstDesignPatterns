package ge.gov.smartlogic.compound.ducks.domain.ducks.observer;

/**
 * Created by loghadze on 21/12/2018.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
