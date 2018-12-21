package ge.gov.smartlogic.compound.ducks.domain.ducks.factory.abstractfactory;

import ge.gov.smartlogic.compound.ducks.domain.ducks.DuckCall;
import ge.gov.smartlogic.compound.ducks.domain.ducks.MallardDuck;
import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.RedheadDuck;

/**
 * Created by loghadze on 20/12/2018.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RedheadDuck();
    }
}
