package Examen2016_1C.Rastreator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public class Hotel {
    private String name;
    private String city;
    private int stars;
    private List<Room> rooms;

    public Hotel(String name, String city, int stars) {
        this.name = name;
        this.city = city;
        if(stars<1) this.stars=1;
        else if (stars>5) this.stars=5;
        else    this.stars = stars;
        rooms = new LinkedList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return(city);
    }

    public int getStars() {
        return stars;
    }

    public List<Room> getRooms(){
        return rooms;
    }

    @Override
    public String toString() {
        String s="";
        for(Room room:rooms){
           s+="\n\tHabitació amb preu: "+room.getPrice();
        }
        return "Hotel: "+name+"\nCiutat: "+getCity()+"\nEstrelles: "+stars+s;
    }

}
