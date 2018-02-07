package course;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pedro on 27/09/15.
 */
public class CourseImpl implements Course, java.io.Serializable {

    private String code;
    private String name;
    private int year;


    List<Professor> professors = new LinkedList<Professor>();
    List<Student> students = new LinkedList<Student>();
    List<Score> scores = new LinkedList<Score>();


    public void addProfessor(Professor prof){
        professors.add(prof);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<Score> getScores() {
        return scores;
    }

    public void addScore(Score prof){
        scores.add(prof);
    }



    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    public CourseImpl() {

    }

    public CourseImpl(String code, String name, int year) {

        this.code = code;
        this.name = name;
        this.year = year;
    }

    public void addStudent(Student stud){
        students.add(stud);

    }



}
