package filter;

/**
 * Created by milax on 15/09/17.
 */
public class ComenA implements IFilter<String>{
    @Override
    public Boolean apply(String elem) {
        return elem.startsWith("A");
    }
}
