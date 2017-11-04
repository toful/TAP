package Examen2013_Familia;

/**
 * Created by milax on 02/11/17.
 */
public abstract class Familia implements Comparable<Familia>{
    protected int edat;
    protected String nom;

    public abstract String presentacio(String tab);

    public abstract int descendents();

    public int getEdat(){
        return edat;
    }

    public String getNom(){
        return nom;
    }

    @Override
    public int compareTo(Familia fill){
        return (fill.getEdat()-edat);
    }

}
