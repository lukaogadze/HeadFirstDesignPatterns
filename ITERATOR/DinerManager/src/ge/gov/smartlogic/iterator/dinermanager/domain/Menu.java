package ge.gov.smartlogic.iterator.dinermanager.domain;

import java.util.Iterator;

/**
 * Created by loghadze on 18/12/2018.
 */
public interface Menu<T> {
    public Iterator<T> createIterator();
}
