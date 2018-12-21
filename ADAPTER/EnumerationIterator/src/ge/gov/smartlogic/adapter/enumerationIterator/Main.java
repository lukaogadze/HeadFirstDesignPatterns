package ge.gov.smartlogic.adapter.enumerationIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // enumerationAdapterTest(args);
        // iteratorAdapterTest(args);

        Vector<String> v = new Vector<>(Arrays.asList(args));

        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iteratorAdapterTest(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(args));
        Enumeration<String> enumeration = new IteratorAdapter<>(arrayList.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    private static void enumerationAdapterTest(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList(args));
        Iterator<String> iterator = new EnumerationAdapter<>(vector.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
