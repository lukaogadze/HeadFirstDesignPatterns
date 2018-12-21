package ge.gov.smartlogic.composite.menu.domain;

import java.util.Iterator;

/**
 * Created by loghadze on 19/12/2018.
 */
public enum NullIterator implements Iterator<MenuComponent> {
    INSTANCE;

    @Deprecated
    public MenuComponent next() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean hasNext() {
        throw new UnsupportedOperationException();
    }
}