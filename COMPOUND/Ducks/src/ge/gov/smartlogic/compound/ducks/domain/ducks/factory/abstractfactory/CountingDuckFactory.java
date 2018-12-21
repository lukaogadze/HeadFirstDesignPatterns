package ge.gov.smartlogic.compound.ducks.domain.ducks.factory.abstractfactory;

import ge.gov.smartlogic.compound.ducks.domain.ducks.DuckCall;
import ge.gov.smartlogic.compound.ducks.domain.ducks.MallardDuck;
import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.RedheadDuck;
import ge.gov.smartlogic.compound.ducks.domain.ducks.RubberDuck;
import ge.gov.smartlogic.compound.ducks.domain.ducks.decorator.QuackCounter;

/**
 * Created by loghadze on 20/12/2018.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
