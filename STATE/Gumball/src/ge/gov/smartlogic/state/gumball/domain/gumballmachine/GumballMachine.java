package ge.gov.smartlogic.state.gumball.domain.gumballmachine;

import ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate.HasQuarterState;
import ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate.NoQuarterState;
import ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate.SoldOutState;
import ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate.SoldState;
import ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate.State;
import ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate.WinnerState;

/**
 * Created by loghadze on 19/12/2018.
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State winnerState;

    private State state;
    private int count;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            --count;
        }
    }

    public int getCount() {
        return count;
    }

    private void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }

    public void setState(final State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
