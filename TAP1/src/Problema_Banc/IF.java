package Problema_Banc;

/**
 * Created by milax on 08/09/17.
 * InvestFund
 */
public class IF extends Compte{
    public IF(float money, Propietari client) {
        super(money, client);
        interest = 0.34 ;

    }

    public void withdrawMoney (double m) throws NoMoney{
        throw new NoMoney("No es poden treure diners d'aquest compte.");
    }
}
