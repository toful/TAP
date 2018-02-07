package Problema_Banc;

/**
 * Created by milax on 08/09/17.
 */
public class Compte {
    static final int comission = 10;

    protected double money;
    private Propietari client;
    protected double interest;

    public Compte(double money, Propietari client) {
        this.money = money;
        this.client = client;
    }

    public void depositeMoney (double m){
        money =+ m;
    }

    public void withdrawMoney (double m) throws NoMoney{
        if(m>money){
            throw new NoMoney("No hi ha suficients diners al compte.");
        }
        else money =- m;
    }

    public double checkBalances (){
        return money;
    }

    public void changeClient (Propietari p){
        client=p;
    }

    public void performMonthlyRevison(){
        money = money + money * interest - comission;
    }


    @Override
    public String toString() {
        return "\nClient:" + client +
                "\nEfeciu: " + money +
                "\nInteres: " + interest + "\n";
    }
}
