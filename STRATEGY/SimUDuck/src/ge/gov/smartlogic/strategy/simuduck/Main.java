package ge.gov.smartlogic.strategy.simuduck;

import ge.gov.smartlogic.strategy.simuduck.ducks.DecoyDuck;
import ge.gov.smartlogic.strategy.simuduck.ducks.Duck;
import ge.gov.smartlogic.strategy.simuduck.ducks.MallardDuck;
import ge.gov.smartlogic.strategy.simuduck.ducks.ModelDuck;
import ge.gov.smartlogic.strategy.simuduck.ducks.RubberDuck;
import ge.gov.smartlogic.strategy.simuduck.ducks.behavior.fly.FlyRocketPowered;

/**
 * Created by loghadze on 17/12/2018.
 */
public class Main {
    public static void main(String[] args) {
        testDucksOne();
        testDucksTwo();
    }

    private static void testDucksTwo() {
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    private static void testDucksOne() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
