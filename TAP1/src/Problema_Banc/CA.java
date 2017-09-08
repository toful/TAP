package Problema_Banc;

/**
 * Created by milax on 08/09/17.
 * Checking account
 */
public class CA extends Compte{

    public CA(double money, Propietari client) {
        super(money, client);
        interest = 0.1;
    }

    public void performMonthlyRevison(){
        money = money + money * interest;
    }


}
