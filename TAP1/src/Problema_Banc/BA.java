package Problema_Banc;

/**
 * Created by milax on 08/09/17.
 * Bonus Account
 */
public class BA extends Compte{
    public BA(float money, Propietari client) {
        super(money, client);
        interest = 0.6;
    }
}
