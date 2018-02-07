package course;

import java.util.List;

/**
 * Created by pedro on 10/2/15.
 */
public interface Course {
    public void addScore(Score s);
    public void addStudent(Student stud);
    public void addProfessor(Professor prof);
    public List<Professor> getProfessors();
    public List<Student> getStudents();
    public String getCode();
    public String getName();
    public List<Score> getScores();

}
