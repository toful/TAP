package Examen2013PizzeriaFactory;

/**
 * Created by milax on 02/11/17.
 */
public class Main {
    public static void main(String[] args){
        AbstractPizzaFactory mondo= MondoPizzaFactory.getInstance();
        AbstractPizzaFactory tot=new TotPizzaFactory();

        System.out.println(mondo.createCheesePizza().showPizza());
        System.out.println(mondo.createTropicalPizza().showPizza());
        System.out.println(tot.createCheesePizza().showPizza());
        System.out.println(tot.createTropicalPizza().showPizza());

        AbstractPizza pizza=mondo.createTropicalPizza();
        for(String topping: pizza){
            System.out.println(topping);
        }


    }
}
