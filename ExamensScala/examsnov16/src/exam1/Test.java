package exam1;


import java.util.List;

/**
 * Created by pedrotgn on 05/10/16.
 */
public class Test {

    public static void main(String args[]){
        Rastreator rastreator = new Rastreator();
     //   LogRastreatorProxy rastreator = new LogRastreatorProxy();

        Hotel rich = new Hotel("rich","tarragona",5);
        Hotel medium = new Hotel("medium","tarragona",3);
        Hotel poor = new Hotel("poor","barcelona",2);
        Hotel disaster = new Hotel("disaster","tarragona",1);

        addRooms(rich,90,5);
        addRooms(rich,80,10);
        addRooms(medium,70,5);
        addRooms(medium,60,10);
        addRooms(poor,40,10);
        addRooms(disaster,20,20);

        rastreator.addObserver(h->h.getCity().equals("barcelona"),h->{System.out.println("OBSERVED:"+h);});
        rastreator.addHotel(rich);
        rastreator.addHotel(medium);
        rastreator.addHotel(poor);
        rastreator.addHotel(disaster);

        List<Hotel> hotels = rastreator.executeQuery(h->h.getCity().equals("tarragona"));

        hotels.forEach(System.out::println);

        QueryFilter qf = new QueryFilter(2,60);



        List<Hotel> hotels2 = rastreator.executeQuery(qf);

        System.out.println("QUERY2");
        hotels2.forEach(System.out::println);

       // System.out.println(rastreator.getSuspicious().size());



    }

    public static void addRooms(Hotel aHotel, int cost, int number){
        for (int i=1;i<number;i++){
            Room newRoom = new Room(cost);
            aHotel.addRoom(newRoom);
        }
    }




}
