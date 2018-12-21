package ge.gov.smartlogic.templatemethod.baristatraining.domain;

/**
 * Created by loghadze on 18/12/2018.
 */
public abstract class CaffeineBeverage implements Beverage {

    @Override
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
