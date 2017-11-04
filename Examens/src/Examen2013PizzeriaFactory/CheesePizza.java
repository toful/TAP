package Examen2013PizzeriaFactory;

/**
 * Created by milax on 02/11/17.
 */
public class CheesePizza extends AbstractPizza{

    public CheesePizza(int price, String ingredient) {
        this.price+=3;
        this.price+=price;
        ingredients.add("Formatge Blau");
        ingredients.add(ingredient);
    }

    @Override
    public String showPizza() {
        return ("Pizza Formatges-"+price+"€ - Ingredients:"+ingredients);
    }
}
