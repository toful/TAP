package Examen2016_1C.Rastreator;

import java.util.function.Predicate;

/**
 * Created by milax on 02/11/17.
 */
public class NewHotelObserver implements Observer{
    Predicate<Hotel> condicion;

    public NewHotelObserver(Predicate<Hotel> p){
        condicion=p;
    }

    public Predicate<Hotel> getCondicion(){
        return condicion;
    }

    @Override
    public void update(Hotel hotel) {
        System.out.println("S'ha afegit un nou hotel amb les característiques dessitjades!!!\n"+hotel);
    }
}
