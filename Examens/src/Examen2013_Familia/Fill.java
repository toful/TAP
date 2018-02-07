package Examen2013_Familia;

/**
 * Created by milax on 02/11/17.
 */
public class Fill extends Familia {

    public Fill(int edat, String nom) {
        this.edat=edat;
        this.nom=nom;
    }

    @Override
    public String presentacio(String tab) {
        String s = "\n"+tab+"Hola em dic "+nom+" i tinc "+edat+" anys.";
        return s;
    }

    public int descendents(){
        return 0;
    }
}
