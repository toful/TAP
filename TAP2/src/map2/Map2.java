package map2;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by milax on 22/09/17.
 */
public class Map2 {

    public static <T,R> List<R> map2(List<T> list, Function<T,R> f){
        List<R> result = new LinkedList<R>();
        for(T elem:list){
            result.add(f.apply(elem));
        }
        return result;
    }
}
