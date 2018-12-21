package ge.gov.smartlogic.templatemethod.baristatraining.domain;

/**
 * Created by loghadze on 18/12/2018.
 */
public interface Beverage {
    public void prepareRecipe();
    public void brew();
    public void addCondiments();
    public void boilWater();
    public void pourInCup();
}
