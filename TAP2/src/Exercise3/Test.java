package Exercise3;

import bank.Account;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Created by milax on 29/09/17.
 */
public class Test {

    public static void main(String[] args) throws IOException{
        List<Account2> accounts= LoadData();

        //accounts.forEach(System.out::print);

        //PER QUE NO ES POT FER AIXÍ??
        //accounts.stream().map(a->a.addBalance(10));

        List<Account2> list0= accounts.stream().map((Account2 a)-> {a.addBalance(10);
        return a;}).collect(Collectors.toList());
        //list0.forEach(System.out::print);


        List<Account2> list1 = accounts.stream().filter(x->x.getTip().equals(type.IF)).collect(Collectors.toList());
        list1.forEach(System.out::print);

        Account2 maxAccount=accounts.stream().max((x1,x2) -> Double.compare(x1.getBalance(), x2.getBalance())).get();
        System.out.println(maxAccount);

        Account2 maxIFAccount = accounts.stream().filter(x->x.getTip().equals(type.IF)).max((x1,x2) -> Double.compare(x1.getBalance(), x2.getBalance())).get();
        System.out.println(maxIFAccount);
    }



    static List<Account2> LoadData() throws IOException {
        List<Account2> accounts= new LinkedList<Account2>();
        Account2 a;
        String id, owner;
        type tip;
        double balance;

        FileReader f = new FileReader("accounts.txt");
        BufferedReader dis = new BufferedReader(f);
        String line;

        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            id = tokens.nextToken();
            owner = tokens.nextToken();
            tip = type.valueOf(tokens.nextToken());
            balance = Double.parseDouble(tokens.nextToken());
            a=new Account2(balance, owner, id, tip);
            accounts.add(a);
        }
        dis.close();
        f.close();

        return accounts;
    }
}
