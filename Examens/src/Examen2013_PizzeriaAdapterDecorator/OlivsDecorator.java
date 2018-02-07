package Examen2013_PizzeriaAdapterDecorator;

/**
 * Created by milax on 02/11/17.
 */
public class OlivsDecorator extends PizzaDecorator{

    public OlivsDecorator(Pizza pizza){
        super(pizza);
        pizza.addTopping("Olives");
    }

    public double getPrize(){
        return (super.getPrice()+2);
    }
}
