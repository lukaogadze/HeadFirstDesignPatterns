package ge.gov.smartlogic.adapter.ducks;

/**
 * Created by loghadze on 17/12/2018.
 */
public class DuckAdapter implements Turkey{
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
