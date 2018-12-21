package ge.gov.smartlogic.iterator.dinermanager.domain;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */


public class CafeMenu implements Menu<MenuItem> {
    private final Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable<>();

        addItem(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));

        addItem(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69));

        addItem(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29));
    }

    public void addItem(MenuItem menuItem) {
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
