package Examen2016_1C.Rastreator;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by milax on 02/11/17.
 */
public class Main {
    public static void main(String[] args){
        Room r1=new Room(2);
        Room r2=new Room(40);
        Room r3=new Room(200);
        Room r4=new Room(50);
        Room r5=new Room(2);
        Room r6=new Room(2);

        Hotel h1=new Hotel("Hostel", "Tarragona", 1);
        Hotel h2=new Hotel("Hostel2", "Tarragona", 2);
        Hotel h3=new Hotel("Hostel3", "Tarragona", 3);
        Hotel h4=new Hotel("Hostel4", "Campredó", 5);
        Hotel h5=new Hotel("Hostel5", "Barcelona", 1);

        h1.addRoom(r1);
        h1.addRoom(r2);
        h2.addRoom(r3);
        h2.addRoom(r4);
        h4.addRoom(r5);
        h5.addRoom(r6);

        Rastreator rastreator=new Rastreator();

        Predicate<Hotel> p = (Hotel x) -> x.getStars()>=4;
        Observer o=new NewHotelObserver(p);
        rastreator.addObserver(o);

        rastreator.addHotel(h1);
        rastreator.addHotel(h2);
        rastreator.addHotel(h3);
        rastreator.addHotel(h4);
        rastreator.addHotel(h5);

        List<Hotel> hotels=rastreator.cityFilter( (Hotel x) -> {return x.getCity().equals("Tarragona");});
        for(Hotel h: hotels){
            System.out.println("\n"+h);
        }

        Predicate<Hotel> minStars = (Hotel x) -> {return x.getStars()>=2;};
        Predicate<Hotel> maxCost = (Hotel x) -> {return x.getRooms().stream().filter( y -> y.getPrice() < 30).count()>=1;};


        System.out.println("\nCerquem hotels amb més de 2 estrelles i habitacions amb cost -30");
        hotels=rastreator.queryFilter(minStars, maxCost);
        for(Hotel h: hotels){
            System.out.println("\n"+h);
        }
    }


}
