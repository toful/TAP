package filter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 15/09/17.
 */
public class Filter {

    public static <T> List<T> filter(List<T> list, IFilter function){
        List<T> result = new LinkedList<T>();
        for (T elem:list){
            if(function.apply(elem)) result.add(elem);
        }
        return result;
    }
}
