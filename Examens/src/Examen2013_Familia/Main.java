package Examen2013_Familia;

/**
 * Created by milax on 02/11/17.
 */
public class Main {
    public static void main(String[] args){
        Pare jay= new Pare(67, "Jay");
        Pare claire= new Pare(43, "Claire");
        Pare mitxhell= new Pare(37, "Mitxhell");
        Fill manny= new Fill(15, "Manny");
        Fill joe= new Fill(1, "Joe");
        Fill haley= new Fill(22, "Haley");
        Fill alex= new Fill(15, "Alex");
        Fill luke= new Fill(14, "Luke");
        Fill lili = new Fill(6, "Lily");

        claire.addSon(luke);
        claire.addSon(haley);
        claire.addSon(alex);
        mitxhell.addSon(lili);
        jay.addSon(claire);
        jay.addSon(mitxhell);
        jay.addSon(manny);
        jay.addSon(joe);


        System.out.println(jay.presentacio(""));

        System.out.println("Descendents de Jay: "+jay.descendents());
        System.out.println("Descendents de claire: "+claire.descendents());
        System.out.println("Descendents de Alex: "+alex.descendents());

        //Part dos
        mitxhell= new CompraDecorator(mitxhell);
        mitxhell= new NetejaDecorator(mitxhell);

        System.out.println(mitxhell.presentacio(""));


    }

}
