package course;

import java.util.List;

/**
 * Created by pedrotgn on 03/10/2017.
 */
public class School implements java.io.Serializable{
    private String name;
    private  List<Course> courses;
    private List<Professor> professors;
    private List<Student> students;

    public School(String name, List<Course> courses, List<Professor> professors, List<Student> students) {
        this.name = name;
        this.courses = courses;
        this.professors = professors;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public List<Student> getStudents() {
        return students;
    }
}
