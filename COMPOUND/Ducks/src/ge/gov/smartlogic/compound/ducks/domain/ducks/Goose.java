package ge.gov.smartlogic.compound.ducks.domain.ducks;

/**
 * Created by loghadze on 20/12/2018.
 */
public class Goose {
    public void honk() {
        System.out.println("Honk");
    }

    @Override
    public String toString() {
        return "Goose";
    }
}
