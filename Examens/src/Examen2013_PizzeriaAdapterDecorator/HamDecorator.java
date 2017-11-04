package Examen2013_PizzeriaAdapterDecorator;

/**
 * Created by milax on 02/11/17.
 */
public class HamDecorator extends PizzaDecorator{
    
    public HamDecorator (Pizza pizza){
        super(pizza);
        pizza.addTopping("Pernil");
    }

    public double getPrice(){
        return (super.getPrice()+3.5);
    }
}
