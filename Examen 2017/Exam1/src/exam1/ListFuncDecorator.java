package exam1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by pedro on 9/19/17.
 */
public class ListFuncDecorator<T> extends LinkedList<T> {

    private LinkedList<T> src;
    private List<Function<T,T>> funcs = new LinkedList<Function<T,T>>();


    public ListFuncDecorator() {
        src = new LinkedList<T>();
    }

    public ListFuncDecorator(LinkedList src) {
        this.src = src;
    }

    public void addFunc(Function<T,T> func) {
        funcs.add(func);
    }

    @Override
    public boolean add(T t) {
        return src.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ProxyIterator<T>(src.iterator(), composeAll());
    }


    public Function<T,T> composeAll(){
        Function<T,T> result = Function.identity();
        for (Function<T,T> elem:funcs)
            result = result.compose(elem);
        return result;
    }




}
