package ge.gov.smartlogic.iterator.dinermanager.domain;


import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            if (menuItems.length - 1 - position - 1 >= 0)
                System.arraycopy(menuItems, position - 1 + 1, menuItems, position - 1, menuItems.length - 1 - position - 1);
            menuItems[menuItems.length - 1] = null;
        }
    }

}
