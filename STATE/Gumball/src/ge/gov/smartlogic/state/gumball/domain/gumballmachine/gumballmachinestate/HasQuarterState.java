package ge.gov.smartlogic.state.gumball.domain.gumballmachine.gumballmachinestate;

import ge.gov.smartlogic.state.gumball.domain.gumballmachine.GumballMachine;

import java.util.Random;

/**
 * Created by loghadze on 19/12/2018.
 */
public class HasQuarterState implements State {
    private final Random randomWinner;
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.randomWinner = new Random(System.currentTimeMillis());
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() { }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
