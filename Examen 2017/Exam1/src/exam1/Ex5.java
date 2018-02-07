package exam1;

import java.util.function.Function;

        import java.util.Iterator;
        import java.util.function.Function;

/**
 * Created by pedro on 9/19/17.
 */
public class Ex5 {

    public static void main(String args[]){




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
