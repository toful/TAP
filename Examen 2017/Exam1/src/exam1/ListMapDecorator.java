package exam1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Function;

/**
 * Created by pedro on 9/19/17.
 */
public class ListMapDecorator<T> extends LinkedList<T> {

    private LinkedList<T> src;
    private Function<T,T> func;

    public ListMapDecorator(LinkedList src,Function<T,T> func) {
        this.src = src;
        this.func = func;
    }

    public void setFunc(Function<T,T>func) {
        this.func = func;
    }

    @Override
    public boolean add(T t) {
        return src.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ProxyIterator<T>(src.iterator(), func);
    }
}


