package ge.gov.smartlogic.templatemethod.baristatraining;

import ge.gov.smartlogic.templatemethod.baristatraining.domain.Coffee;
import ge.gov.smartlogic.templatemethod.baristatraining.domain.CoffeeWithHook;
import ge.gov.smartlogic.templatemethod.baristatraining.domain.Tea;
import ge.gov.smartlogic.templatemethod.baristatraining.domain.TeaWithHook;

public class Main {

    public static void main(String[] args) {
        // caffeineBeverageTest();
        caffeineBeverageWithHookTest();
    }

    private static void caffeineBeverageWithHookTest() {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }

    private static void caffeineBeverageTest() {
        Tea teaWithLemon = new Tea();
        teaWithLemon.prepareRecipe();

        System.out.println();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
