package Examen2013_PizzeriaAdapterDecorator;

import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public class PizzaDecorator extends Pizza{
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        super();
        this.pizza=pizza;
    }

    public List<String> getToppings(){
        return (pizza.getToppings());
    }

    public void addTopping(String topping){
        pizza.addTopping(topping);
    }

    public double getPrice() {
        return pizza.getPrice();
    }

}
