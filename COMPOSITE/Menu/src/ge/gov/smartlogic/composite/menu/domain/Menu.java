package ge.gov.smartlogic.composite.menu.domain;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class Menu extends MenuComponent {
    private final ArrayList<MenuComponent> menuComponents;
    private final String name;
    private final String description;
    private Iterator<MenuComponent> iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.menuComponents = new ArrayList<>();
        this.iterator = NullIterator.INSTANCE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == NullIterator.INSTANCE) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
