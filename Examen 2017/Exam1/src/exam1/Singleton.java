package exam1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pedro on 10/4/17.
 */
public class Singleton {

    private static Map<String,Integer> count = new HashMap<String, Integer>();


    private Singleton() {}

    //The only way to get the instance
    public static Map<String,Integer> getInstance(){
        return count;
    }

}
