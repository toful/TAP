package filter;

/**
 * Created by milax on 15/09/17.
 */
public class Major3 implements IFilter<Integer> {
    @Override
    public Boolean apply(Integer elem) {
        if (elem > 3) return true;
        else return false;
    }
}
