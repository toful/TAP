package exam1;

import java.util.function.Predicate;

/**
 * Created by pedrotgn on 05/10/16.
 */
public class QueryFilter implements Predicate<Hotel> {

    private int minStars;
    private int maxCost;

    public QueryFilter(int minS,int maxC){
        minStars = minS;
        maxCost = maxC;
    }

    @Override
    public boolean test(Hotel hotel) {
        if (hotel.getStars()>minStars){
            long count = hotel.getRooms().stream().filter(r->r.getCost()<=maxCost).count();
            if (count>0)
                return true;
            else
                return false;
        }else {
            return false;
        }
    }
}
