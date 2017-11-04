package course2;

import course.Score;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pedrotgn on 04/10/2017.
 */
public class Singleton {


    private static List<Score> allscores = new LinkedList<>();

    //Private constructor makes impossible to create foreign instances
    private Singleton() {}

    //The only way to get the instance
    public static List<Score> getInstance(){
        return allscores;
    }
}
