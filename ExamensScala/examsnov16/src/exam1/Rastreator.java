package exam1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by pedrotgn on 05/10/16.
 */
public class Rastreator {
    private List<Hotel> hotels = new LinkedList<Hotel>();
    private Map<Observer,Predicate<Hotel>> observers = new HashMap<>();


    public void addHotel(Hotel h){
        hotels.add(h);
        notify(h);
    }

    public List<Hotel> executeQuery(Predicate<Hotel> predicate){
        return hotels.stream().filter(predicate).collect(Collectors.toList());
    }

    public void addObserver(Predicate<Hotel> filter,Observer observer){
        observers.put(observer,filter);
    }

    public void notify(Hotel h){
        for (Observer o:observers.keySet()){
            Predicate<Hotel> filter = observers.get(o);
            if (filter.test(h))
                o.newHotel(h);
        }
    }



}
