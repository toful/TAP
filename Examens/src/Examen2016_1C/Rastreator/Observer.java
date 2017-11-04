package Examen2016_1C.Rastreator;

import java.util.function.Predicate;

/**
 * Created by milax on 02/11/17.
 */
public interface Observer {
    public void update(Hotel hotel);
    public Predicate<Hotel> getCondicion();
}
