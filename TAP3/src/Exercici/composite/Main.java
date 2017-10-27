package Exercici.composite;

import java.util.List;
import java.util.function.Predicate;

public class Main {

	/**
	 * @param args
	 */
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

		System.out.println("\nRoot ls:\n"+root.ls());
		System.out.println("\nhome ls:\n"+home.ls());

		AComponentVisitor lsvisitor = new LsVisitor();
		root.accept(lsvisitor);

		System.out.println("\nCollect:");
		for(String elem:root.collect()){
			System.out.println(elem);
		}

		System.out.println("\nToList:");
		List<AComponent> elems= home.toList();
		for(AComponent elem:elems){
			System.out.println(elem);
		}

		System.out.println("\nSerach:");
		List<File> elems2= root.search("lp");
		for(AComponent elem:elems2){
			System.out.println(elem);
		}

		Predicate<File> p = (File x) -> {return (x.size()>4000);};
		System.out.println("\nSerach with predicate (size > 4000):");
		List<File> elems3= root.search(p);
		for(AComponent elem:elems3){
			System.out.println(elem);
		}

		Predicate<File> p2 = (File x) -> {return (x.getName().startsWith("f"));};
		System.out.println("\nSerach with predicate (starts with f):");
		List<File> elems4= root.search(p2);
		for(AComponent elem:elems4){
			System.out.println(elem);
		}

	}

}
