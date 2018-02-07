package course;

/**
 * Created by pedro on 29/09/15.
 */
public class Score implements java.io.Serializable{
    private Student student;
    private int score;

    public Score(Student aStudent, int score) {
        this.student = aStudent;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student aStudent) {
        this.student = aStudent;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "aStudent=" + student +
                ", score=" + score +
                '}';
    }
}
