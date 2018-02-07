package Examen2013PizzeriaFactory;

/**
 * Created by milax on 02/11/17.
 */
public class TotPizzaFactory extends AbstractPizzaFactory{

    public TotPizzaFactory() {
        name="Tot pizza";
    }

    @Override
    public AbstractPizza createTropicalPizza() {
        AbstractPizza pizza=new TropicalPizza(2, "Olives negres");
        return pizza;
    }

    @Override
    public AbstractPizza createCheesePizza() {
        AbstractPizza pizza=new CheesePizza(2, "Gouda");
        return pizza;
    }
}
