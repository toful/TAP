package exam1;

import java.util.Iterator;
import java.util.function.Function;

/**
 * Created by pedro on 9/19/17.
 */
public class ProxyIterator<T> implements Iterator<T> {

    private Iterator<T> elem;
    private Function<T,T> func;

    public ProxyIterator(Iterator<T> elem, Function<T,T>func) {
        this.elem = elem;
        this.func = func;
    }

    @Override
    public boolean hasNext() {
        return elem.hasNext();
    }

    @Override
    public T next() {
        return func.apply(elem.next());
    }
}
