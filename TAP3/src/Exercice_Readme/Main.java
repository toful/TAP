package Exercice_Readme;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory tap = new Directory("tap");
        File f1 = new File("f1",1234);
        File f2 = new File("f2",3445);
        File f3 = new File("f3",6688);
        File f4 = new File("lp",99999);
        root.addChild(home);
        root.addChild(f1);
        home.addChild(tap);
        home.addChild(f2);
        tap.addChild(f3);
        root.addChild(f4);


        System.out.println("-------------");

        System.out.println("Root SIZE:"+root.size());
        System.out.println("Home SIZE:"+home.size());
        System.out.println("TAP SIZE:"+tap.size());

        System.out.println("\nRoot ls:");
        root.ls();
        System.out.println("\nhome ls:");
        home.ls();

        List<String> l1 = root.collect();
        System.out.println("\n"+l1);

        List<IComponent> l2 = root.toList();
        for(IComponent elem:l2){
            System.out.println(elem.getName());
        }

        System.out.println("Search f3: ");
        List<File> l3 = root.search("f3");
        for(File elem:l3){
            System.out.println(elem.getName()+"\t"+elem.getSize());
        }

        Predicate<File> p1 = x -> x.getSize()>3500;
        List<File> l4 = root.search2(p1);
        for(File elem:l4){
            System.out.println(elem.getName()+"\t"+elem.getSize());
        }

        System.out.println("\n\nls amb Visitor");
        Visitor lsvisitor = new LsVisitor();
        root.accept(lsvisitor);

        System.out.println("Visitor code:-----search");
        SearchVisitor search = new SearchVisitor(x -> x.getName().equals("f3"));
        root.accept(search);
        List<File> results = search.getResult();
        for (File f:results)
            System.out.println(f.getName());

    }
}
