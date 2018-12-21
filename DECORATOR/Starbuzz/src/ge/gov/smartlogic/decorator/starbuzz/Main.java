package ge.gov.smartlogic.decorator.starbuzz;

import ge.gov.smartlogic.decorator.starbuzz.beverages.BeverageSize;
import ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments.Mocha;
import ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments.Soy;
import ge.gov.smartlogic.decorator.starbuzz.beverages.Beverage;
import ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.DarkRoast;
import ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.Espresso;
import ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.HouseBlend;
import ge.gov.smartlogic.decorator.starbuzz.beverages.coffees.condiments.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        printCoffee(espresso.getDescription(), espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        printCoffee(darkRoast.getDescription(), darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setBeverageSize(BeverageSize.VENTI);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        printCoffee(houseBlend.getDescription(), houseBlend.cost());

    }

    private static void printCoffee(String description, double cost) {
        final String message = String.format("%s $%.2f",description, cost);
        System.out.println(message);
    }
}
