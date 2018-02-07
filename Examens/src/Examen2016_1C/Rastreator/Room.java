package Examen2016_1C.Rastreator;

/**
 * Created by milax on 02/11/17.
 */
public class Room {
    private int price;

    public Room(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\tHabitació amb preu: "+price;
    }
}
