package exam2;

/**
 * Created by pedrotgn on 06/10/16.
 */
public class Test {

    public static void main(String args[]){
        Mailer mail = new Mailer();
        Site tarragona = new Site("tarragona");
        Site barcelona = new Site("barcelona");
        Site madrid = new Site("madrid");
        mail.addSite(tarragona);
        mail.addSite(barcelona);
        mail.addSite(madrid);

        Message m1 = new Message("reus","bob","tarragona","hi all");
        Message m2 = new Message("salou","ahmed","tarragona","he isis silly");
        Message m3 = new Message("salou","ahmed","barcelona","hi all");
        Message m4 = new Message("essex","tim","madrid","hi all super party bomb");
        Message m5 = new Message("tarragona","pau","barcelona","superb");

        NSADecorator nsa = new NSADecorator(mail);
        StampDecorator box = new StampDecorator(nsa);

        box.send(m1);
        box.send(m2);
        box.send(m3);
        box.send(m4);
        box.send(m5);

        System.out.println(mail.countMessages("tarragona")==2);
        System.out.println(mail.peopleFrom("salou").size()==2);

        for (Message m:nsa.getSuspicious())
            System.out.println(m);



    }
}
