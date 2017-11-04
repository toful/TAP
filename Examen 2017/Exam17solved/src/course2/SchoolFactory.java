package course2;

import course.Course;
import course.School;

/**
 * Created by pedrotgn on 03/10/2017.
 */
public interface SchoolFactory {
    public School createSchool(String name);
    public School createSchool();
    public Course createCourse(String code, String name, int year);





}
