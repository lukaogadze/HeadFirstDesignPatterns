package ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate;

/**
 * Created by loghadze on 19/12/2018.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
