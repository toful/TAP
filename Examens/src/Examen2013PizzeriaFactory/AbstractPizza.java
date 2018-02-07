package Examen2013PizzeriaFactory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public abstract class AbstractPizza implements Iterable<String>{
    protected int price;
    protected List<String> ingredients= new LinkedList<>();

    public AbstractPizza(){
        price=5;
        ingredients.add("Salsa de tomaca");
        ingredients.add("Mozzarella");
    }

    public abstract String showPizza();

    @Override
    public Iterator<String> iterator() {
        return ingredients.iterator();
    }
}
