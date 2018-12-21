package ge.gov.smartlogic.adapter.enumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class IteratorAdapter<T> implements Enumeration<T> {
    private final Iterator<T> iterator;

    public IteratorAdapter(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
