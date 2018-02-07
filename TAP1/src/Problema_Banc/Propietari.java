package Problema_Banc;

/**
 * Created by milax on 08/09/17.
 */
public class Propietari {
    private int id;
    private String name;
    private int number;
    private String adress;

    public Propietari(int id, String name, int number, String adress) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "\n\tid: " + id +
                "\n\tNom: " + name+
                "\n\tTelèfon: " + number +
                "\n\tAdressa: " + adress;
    }
}
