package ge.gov.smartlogic.compound.ducks.domain.ducks.observer;

/**
 * Created by loghadze on 21/12/2018.
 */
public class Quackologist implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Quackologist: " + subject + " just quacked");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }
}
