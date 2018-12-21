package ge.gov.smartlogic.singleton.threadsafe;

public class Main {

    public static void main(String[] args) {
        ChocolateBoiler boiler2 = ChocolateBoiler.INSTANCE;
        ChocolateBoiler boiler3 = ChocolateBoiler.INSTANCE;
    }
}
