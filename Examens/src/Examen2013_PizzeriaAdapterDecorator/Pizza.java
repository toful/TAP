package Examen2013_PizzeriaAdapterDecorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public class Pizza {
    private double price;
    private List<String> toppings = new ArrayList<String>();

    public Pizza() {
        price=2.0;
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public double getPrice() {
        return price;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza:" +
                "\n\tPreu: " + getPrice() +
                "\n\tIngredients: " + getToppings();
    }
}
