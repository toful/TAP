package Examen2013_Familia;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 02/11/17.
 */
public class Pare extends Familia {
    private List<Familia> fills;

    public Pare(int edat, String nom){
        this.edat=edat;
        this.nom=nom;
        fills=new LinkedList<Familia>();
    }

    public void addSon(Familia son){
        fills.add(son);
        Collections.sort(fills);
    }

    @Override
    public String presentacio(String tab) {
        String s = "\n"+tab+"Hola em dic "+nom+" i tinc "+edat+" anys";
        s=s+"\n\t"+tab+"Aquests són els meus fills:";
        for (Familia fill:fills)
            s=s+fill.presentacio(tab+"\t");
        return s;
    }

    public int descendents(){
        int descendents=fills.size();
        for(Familia fill:fills){
            descendents+=fill.descendents();
        }
        return descendents;
    }
}
