package ge.gov.smartlogic.composite.menu.domain;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by loghadze on 19/12/2018.
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    private final Stack<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        this.stack = new Stack<>();
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return  false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
}
