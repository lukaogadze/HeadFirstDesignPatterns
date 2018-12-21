package ge.gov.smartlogic.templatemethod.sortducks.domain;

/**
 * Created by loghadze on 18/12/2018.
 */
public class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Duck other) {
        return Integer.compare(this.weight, other.weight);
    }
}
