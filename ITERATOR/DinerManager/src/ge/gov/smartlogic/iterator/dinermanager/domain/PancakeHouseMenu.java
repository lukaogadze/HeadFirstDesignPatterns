package ge.gov.smartlogic.iterator.dinermanager.domain;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class PancakeHouseMenu implements Menu<MenuItem> {
    private final ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));

        addItem(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));

        addItem(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));

        addItem(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
