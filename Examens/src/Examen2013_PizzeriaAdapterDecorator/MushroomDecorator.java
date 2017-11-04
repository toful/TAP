package Examen2013_PizzeriaAdapterDecorator;

/**
 * Created by milax on 02/11/17.
 */
public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza pizza){
        super(pizza);
        pizza.addTopping("Xampinyons");
    }

    public double getPrize(){
        return (super.getPrice()+2.5);
    }

}
