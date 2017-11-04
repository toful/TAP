package Examen2013PizzeriaFactory;

/**
 * Created by milax on 02/11/17.
 */
public class MondoPizzaFactory extends AbstractPizzaFactory{

    private static MondoPizzaFactory mondoPizza=new MondoPizzaFactory();

    private MondoPizzaFactory() {
        name="Mondo pizza";
    }

    public static MondoPizzaFactory getInstance(){
        return mondoPizza;
    }

    @Override
    public AbstractPizza createTropicalPizza() {
        AbstractPizza pizza=new TropicalPizza(3, "Xampinyons");
        return pizza;
    }

    @Override
    public AbstractPizza createCheesePizza() {
        AbstractPizza pizza=new CheesePizza(3, "Formatge de cabra");
        return pizza;
    }
}
