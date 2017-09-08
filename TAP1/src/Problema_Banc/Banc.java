package Problema_Banc;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 08/09/17.
 */
public class Banc {
    private String name;
    private List<Compte> comptes = new LinkedList<Compte>();
    private List<Propietari> propietaris = new LinkedList<Propietari>();

    /**Constructor
     *
     * @param name nom del banc
     */
    public Banc(String name) {
        this.name = name;
    }

    /**Afegeix un nou compte al banc
     *
     * @param account que s'afegirà
     */
    public void afegirCompte(Compte account){
        comptes.add(account);
    }

    /**Borra un compte del banc
     *
     * @param account que es borrarà
     */
    public void borrarCompte(Compte account){
        comptes.remove(account);
    }

    /**Retorna els comptes actuals en el banc
     *
     * @return comptes acuals en el banc
     */
    public List<Compte> getComptes(){
        return comptes;
    }

    /**Afegeix un nou propietari al banc
     *
     * @param owner propietari a afegir
     */
    public void afegirPropietari(Propietari owner){
        propietaris.add(owner);
    }

    /**Borra un propietari del banc
     *
     * @param owner propietari a eliminar
     */
    public void borraPropietari(Propietari owner){
        propietaris.remove(owner);
    }

    public void revision(){
        for (Compte c:comptes){
            c.performMonthlyRevison();
        }
    }


}
