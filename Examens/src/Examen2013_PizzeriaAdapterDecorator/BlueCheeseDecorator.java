package Examen2013_PizzeriaAdapterDecorator;

/**
 * Created by milax on 02/11/17.
 */
public class BlueCheeseDecorator extends PizzaDecorator{

    public BlueCheeseDecorator(Pizza pizza) {
        super(pizza);
        pizza.addTopping("Formatge blau");
    }

    public double getPrice(){
        return (super.getPrice()+3.0);
    }
}
