package course2;

import course.Course;

/**
 * Created by pedrotgn on 04/10/2017.
 */
public class LogCourseFactory extends CSVFactory {

    @Override
    public Course createCourse(String code, String name, int year) {
        return new LogCourse(code, name, year);
    }
}
