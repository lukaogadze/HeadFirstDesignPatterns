package ge.gov.smartlogic.templatemethod.baristatraining.domain;

/**
 * Created by loghadze on 18/12/2018.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
