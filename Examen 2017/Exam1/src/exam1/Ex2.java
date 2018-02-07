package exam1;

import java.util.Iterator;
import java.util.function.Function;

/**
 * Created by pedro on 9/19/17.
 */
public class Ex2 {

    public static void main(String args[]){


        // EX2
       ListSetDecorator<String> names3 = new ListSetDecorator<String>();
       names3.add("TAP");
       names3.add("es");
       names3.add("la");
       names3.add("mejor");
       names3.add("mejor");

        System.out.println(names3);

        // EX3

        ListMapDecorator<String> names4 = new ListMapDecorator<String>(names3,(String s)-> s.toUpperCase());
        names4.add("TAP");
        names4.add("es");
        names4.add("la");
        names4.add("mejor");
        names4.add("mejor");


        System.out.println(names4);






        ListFuncDecorator<String> names5 = new ListFuncDecorator<String>();
        names5.add("TAP");
        names5.add("es");
        names5.add("la");
        names5.add("mejor");
        names5.add("mejor");


        Function<String,String> capitals = (String z)-> z.toLowerCase();
        Function<String,String> replaceAs = (String  z)-> z.replace("a","YYYY");
        Function<String,String> replaceJs = (String z)-> z.replace("j","XXX");

        names5.addFunc(capitals);
        names5.addFunc(replaceAs);
        names5.addFunc(replaceJs);

        System.out.println(names5);

        ListFuncDecorator<String> names6  =  (ListFuncDecorator<String>)  names5.clone();

        names6.add("mejor AMIGOS");
        System.out.println(names6);

    }
}
