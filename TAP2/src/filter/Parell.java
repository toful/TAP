package filter;

/**
 * Created by milax on 15/09/17.
 */
public class Parell implements IFilter<Integer>{
    @Override
    public Boolean apply(Integer elem) {
        if (elem%2==0) return true;
        else return false;
    }
}
