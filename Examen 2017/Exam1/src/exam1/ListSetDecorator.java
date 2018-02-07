package exam1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pedro on 9/19/17.
 */
public class ListSetDecorator<T> extends LinkedList<T> {

    private LinkedList list;

    public ListSetDecorator(LinkedList source) {
        list = source;
    }

    public ListSetDecorator() {
        list = new LinkedList<T>();
    }

    @Override
    public boolean add(T o) {
        if (!list.contains(o))
            return list.add(o);
        else
            return false;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
