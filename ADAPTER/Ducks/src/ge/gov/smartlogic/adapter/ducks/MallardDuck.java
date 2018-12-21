package ge.gov.smartlogic.adapter.ducks;

/**
 * Created by loghadze on 17/12/2018.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying");
    }
}
