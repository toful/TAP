package filter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by milax on 15/09/17.
 */
public class FilterSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        List<String> list2 = Arrays.asList("pedro", "lenguajes", "Arogramacion", "Java", "haskell");


        List<Integer> result  = Filter.filter(list, new Major3());
        for (Integer elem:result)
            System.out.println(elem);

        result  = Filter.filter(list, new Parell());
        for (Integer elem:result)
            System.out.println(elem);


        List<String> result2 = Filter.filter(list2, new ComenA());
        for (String elem:result2)
            System.out.println(elem);


    }
}
