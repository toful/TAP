package course2;

import course.CourseImpl;
import course.Score;

/**
 * Created by pedrotgn on 04/10/2017.
 */
public class LogCourse extends CourseImpl {

    public LogCourse(String code, String name, int year) {
        super(code, name, year);
    }

    @Override
    public void addScore(Score score) {
        super.addScore(score);
        Singleton.getInstance().add(score);
    }
}
