package ge.gov.smartlogic.compound.ducks;

import ge.gov.smartlogic.compound.ducks.domain.ducks.factory.abstractfactory.AbstractDuckFactory;
import ge.gov.smartlogic.compound.ducks.domain.ducks.factory.abstractfactory.CountingDuckFactory;

public class Main {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

}
