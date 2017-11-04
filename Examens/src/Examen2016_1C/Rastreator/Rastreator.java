package Examen2016_1C.Rastreator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by milax on 02/11/17.
 */
public class Rastreator {
    private List<Hotel> hotels;
    private List<Observer> observers = new ArrayList<Observer>();

    public Rastreator(){
        hotels=new LinkedList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(Hotel hotel){
        for(Observer observer:observers){
            if(observer.getCondicion().test(hotel)){
                observer.update(hotel);
            }
        }
    }

    public void addHotel(Hotel hotel){
        hotels.add(hotel);
        notifyAllObservers(hotel);
    }

    public List<Hotel> cityFilter(Predicate<Hotel> predicate){
        List<Hotel> hotelsFromCity=hotels.stream().filter(predicate).collect(Collectors.toList());
        return hotelsFromCity;
    }

    public List<Hotel> queryFilter(Predicate<Hotel> minStars, Predicate<Hotel> maxCost){
        List<Hotel> result=hotels.stream().filter(minStars).collect(Collectors.toList());
        result=result.stream().filter(maxCost).collect(Collectors.toList());
        return result;
    }
}
