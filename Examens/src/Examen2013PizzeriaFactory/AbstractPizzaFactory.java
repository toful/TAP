package Examen2013PizzeriaFactory;

/**
 * Created by milax on 02/11/17.
 */
public abstract class AbstractPizzaFactory {
    public String name;

    public abstract AbstractPizza createTropicalPizza();

    public abstract AbstractPizza createCheesePizza();

}
