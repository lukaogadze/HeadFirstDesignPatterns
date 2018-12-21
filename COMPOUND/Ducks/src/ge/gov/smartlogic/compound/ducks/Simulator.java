package ge.gov.smartlogic.compound.ducks;

import ge.gov.smartlogic.compound.ducks.domain.ducks.Goose;
import ge.gov.smartlogic.compound.ducks.domain.ducks.Quackable;
import ge.gov.smartlogic.compound.ducks.domain.ducks.composite.Flock;
import ge.gov.smartlogic.compound.ducks.domain.ducks.factory.abstractfactory.AbstractDuckFactory;
import ge.gov.smartlogic.compound.ducks.domain.ducks.adapter.GooseAdapter;
import ge.gov.smartlogic.compound.ducks.domain.ducks.decorator.QuackCounter;
import ge.gov.smartlogic.compound.ducks.domain.ducks.observer.Quackologist;

/**
 * Created by loghadze on 20/12/2018.
 */
public class Simulator {
    void simulate(AbstractDuckFactory duckFactory) {

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " +
                QuackCounter.getNumberOfQuacks() +
                " times");
    }

    private static void simulate(Quackable duck) {
        duck.quack();
    }
}
