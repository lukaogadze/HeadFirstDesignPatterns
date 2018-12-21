package ge.gov.smartlogic.factory.method.pizzashop;

import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.chicagostyle.ChicagoPizzaStore;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.newyorkstyle.NYPizzaStore;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.common.Pizza;
import ge.gov.smartlogic.factory.method.pizzashop.domain.pizzas.pizzastores.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza myPizza = chicagoStore.orderPizza("cheese");

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
