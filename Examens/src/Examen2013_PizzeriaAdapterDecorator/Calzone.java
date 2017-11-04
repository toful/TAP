package Examen2013_PizzeriaAdapterDecorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public class Calzone {
    private double price;
    private String toppings[] = new String[3];

    public Calzone() {
        price=3;
    }

    public void addTopping(String topping, int pos){
        try{
            toppings[pos]=topping;
        }
        catch(Exception e){
            System.out.println("Error a l'introduïr un nou ingredient");
        }
    }

    public double getPrice() {
        return price;
    }

    public String[] getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza:" +
                "\n\tPreu: " + getPrice() +
                "\n\tIngredients: " + getToppings();
    }
}
