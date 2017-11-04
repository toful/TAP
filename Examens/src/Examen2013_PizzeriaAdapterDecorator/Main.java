package Examen2013_PizzeriaAdapterDecorator;

/**
 * Created by milax on 02/11/17.
 */
public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza();

        pizza=new MushroomDecorator(pizza);
        pizza=new HamDecorator(pizza);
        pizza=new BlueCheeseDecorator(pizza);

        System.out.println(pizza);

        Calzone calzone= new Calzone();
        Pizza calzoneAdap=new PizzaToCalsoneAdapter(calzone);

        calzoneAdap=new MushroomDecorator(calzoneAdap);
        calzoneAdap=new HamDecorator(calzoneAdap);
        calzoneAdap=new BlueCheeseDecorator(calzoneAdap);

        System.out.println(calzoneAdap);


    }
}
