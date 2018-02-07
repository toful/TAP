package filter;

/**
 * Created by milax on 15/09/17.
 */
public interface IFilter<T>{
    Boolean apply(T elem);
}
