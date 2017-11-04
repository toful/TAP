package Examen2013PizzeriaFactory;

/**
 * Created by milax on 02/11/17.
 */
public class TropicalPizza extends AbstractPizza{


    public TropicalPizza(int price, String ingredient) {
        price+=2;
        this.price+=price;
        ingredients.add("Pinya");
        ingredients.add(ingredient);
    }

    @Override
    public String showPizza() {
        return ("Pizza Tropical-"+price+"€ - Ingredients:"+ingredients);
    }
}
