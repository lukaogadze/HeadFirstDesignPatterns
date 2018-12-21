package ge.gov.smartlogic.templatemethod.baristatraining.domain;

/**
 * Created by loghadze on 18/12/2018.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
