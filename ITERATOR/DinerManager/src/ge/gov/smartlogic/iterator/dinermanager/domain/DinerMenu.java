package ge.gov.smartlogic.iterator.dinermanager.domain;


import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class DinerMenu implements Menu<MenuItem> {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));

        addItem(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99));

        addItem(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29));

        addItem(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05));


        addItem(new MenuItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99));

        addItem(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89));
    }

    public void addItem(MenuItem menuItem)
    {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
