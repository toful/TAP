package course2;

import course.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by pedrotgn on 03/10/2017.
 */
public class Solution {


    public static void main(String args[]) throws Exception{

        //Ex. 1, 2
        SchoolFactory fact = new CSVFactory();
        School urv = fact.createSchool("urv");

        // Ex3, 4
        fact = new LogCourseFactory();
        School urv3 = fact.createSchool("urv2");

        System.out.println("scores = "+ Singleton.getInstance());



        //Ex 5
        // A
        List<Course> subjects = urv.getCourses().stream().filter(c->c.getProfessors().stream().anyMatch(p->p.getType().equals(Quality.GOOD))).collect(Collectors.toList());
        System.out.println(subjects);

        //B
        Map<Quality,List<Professor>> rankprofs = urv.getProfessors().stream().collect(Collectors.groupingBy(Professor::getType));
        System.out.println(rankprofs);

        // C
        Map<Course,Double> rankcourses = new HashMap<Course,Double>();
        urv.getCourses().forEach(c->{

            double avg = c.getScores().stream().mapToInt(Score::getScore).average().getAsDouble();
            rankcourses.put(c,avg);
        });

        System.out.println(rankcourses);

        // D
        List<Course> ordered = urv.getCourses().stream().sorted((x, y)->Double.compare(rankcourses.get(x),rankcourses.get(y))).collect(Collectors.toList());
        System.out.println(ordered);




    }

}
