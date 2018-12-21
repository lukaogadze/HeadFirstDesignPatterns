package ge.gov.smartlogic.compound.ducks.domain.ducks;

import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Subject;

/**
 * Created by loghadze on 20/12/2018.
 */
public interface Quackable extends Subject {
    public void quack();
}
