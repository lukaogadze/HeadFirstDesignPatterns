package ge.gov.smartlogic.adapter.enumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public class EnumerationAdapter<T> implements Iterator<T> {
    private final Enumeration<T> enumeration;

    public EnumerationAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }
}
