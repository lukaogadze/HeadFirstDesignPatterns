package ge.gov.smartlogic.compound.ducks.domain.ducks.factory.abstractfactory;

import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;

/**
 * Created by loghadze on 20/12/2018.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
