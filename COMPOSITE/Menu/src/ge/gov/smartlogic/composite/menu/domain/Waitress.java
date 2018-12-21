package ge.gov.smartlogic.composite.menu.domain;

import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class Waitress {
    private final MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = menuComponent.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof MenuItem && menuComponent.isVegetarian()) {
                menuComponent.print();
            }
        }
    }
}
