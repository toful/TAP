package exam1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pedrotgn on 05/10/16.
 */
public class Hotel {
    private String name;
    private String city;
    private int stars;
    private List<Room> rooms = new LinkedList<Room>();

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", stars=" + stars +
                '}';
    }

    public Hotel(String name, String city, int stars) {
        this.city = city;
        this.name = name;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getStars() {
        return stars;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room r){
        rooms.add(r);
    }

}
