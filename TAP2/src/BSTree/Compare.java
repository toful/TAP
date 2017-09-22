package BSTree;

import java.util.Comparator;

/**
 * Created by Tòful on 19/09/17.
 */
public class Compare implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }
}
