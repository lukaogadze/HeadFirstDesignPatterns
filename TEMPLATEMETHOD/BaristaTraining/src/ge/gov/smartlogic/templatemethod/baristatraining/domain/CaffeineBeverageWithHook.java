package ge.gov.smartlogic.templatemethod.baristatraining.domain;

/**
 * Created by loghadze on 18/12/2018.
 */
public abstract class CaffeineBeverageWithHook implements Beverage{

    @Override
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }


    public boolean customerWantsCondiments() {
        return true;
    }
}
