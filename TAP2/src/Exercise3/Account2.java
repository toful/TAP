package Exercise3;

import bank.Customer;
import bank.NoMoney;

/**
 * Created by pedro on 9/14/15.
 */
public class Account2 {
    private String id;
    private double balance;
    private String owner;
    private type tip;

    public Account2(double balance, String owner, String id, type tip) {
        this.balance = balance;
        this.owner = owner;
        this.id=id;
        this.tip=tip;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public type getTip() {
        return tip;
    }
    public void setTip(type tip) {
        this.tip = tip;
    }
    public void addBalance(double a){
        balance=balance+a;
    }

    @Override
    public String toString() {
        return "\nCompte:\n" +
                "\tid: " + id +
                "\n\tPropietari: '" + owner +
                "\n\tBalanç: " + balance +
                "\n\tTipus de compte:" + tip;
    }
}
