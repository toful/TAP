package Examen2013_PizzeriaAdapterDecorator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public class PizzaToCalsoneAdapter extends Pizza{
    private Calzone calzone;
    private int numIngred;

    public PizzaToCalsoneAdapter(Calzone calzone){
        this.calzone=calzone;
        numIngred=0;
    }

    @Override
    public void addTopping(String topping) {
        calzone.addTopping(topping, numIngred);
        numIngred++;
    }

    @Override
    public double getPrice() {
        return calzone.getPrice();
    }

    @Override
    public List<String> getToppings() {
        List<String> list=new LinkedList<>();
        for(String elem:calzone.getToppings()){
            list.add(elem);
        }
        return list;
    }

    @Override
    public String toString() {
            return "Pizza:" +
            "\n\tPreu: " + getPrice() +
            "\n\tIngredients: " + getToppings();
    }
}
