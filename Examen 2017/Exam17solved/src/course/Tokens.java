package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by pedro on 9/21/15.
 */
public class Tokens {


    public static List<Professor> parseProfessors(String filename) throws IOException {
        FileReader fis = new FileReader(filename);
        BufferedReader dis = new BufferedReader(fis);
        String line;

        List<Professor> list = new LinkedList<>();


        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            Professor c = new Professor(tokens.nextToken(), tokens.nextToken(), Quality.valueOf(tokens.nextToken()), Integer.parseInt(tokens.nextToken()));
            list.add(c);

        }

        dis.close();
        return list;

    }


    public static List<Student> parseStudents(String filename) throws IOException {
        FileReader fis = new FileReader(filename);
        BufferedReader dis = new BufferedReader(fis);
        String line;

        List<Student> list = new LinkedList<>();


        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            Student c = new Student(tokens.nextToken(), tokens.nextToken(), Integer.parseInt(tokens.nextToken()));
            list.add(c);
        }

        dis.close();
        return list;

    }

    public static List<Course> parseCourses(String filename) throws IOException {
        FileReader fis = new FileReader(filename);
        BufferedReader dis = new BufferedReader(fis);
        String line;

        List<Course> list = new LinkedList<>();


        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            Course c = new CourseImpl(tokens.nextToken(), tokens.nextToken(), Integer.parseInt(tokens.nextToken()));
            list.add(c);

        }

        dis.close();
        return list;

    }


    public static void updateProfessors(List<Course> courses, List<Professor> profs, String filename) throws IOException {
        FileReader fis = new FileReader(filename);
        BufferedReader dis = new BufferedReader(fis);
        String line;


        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            String courseId = tokens.nextToken();
            Course c = courses.stream().filter(e -> e.getCode().equals(courseId)).findFirst().get();
            while (tokens.hasMoreTokens()) {
                String profId = tokens.nextToken();
                Professor prof = profs.stream().filter(e -> e.getCode().equals(profId)).findFirst().get();
                c.addProfessor(prof);
            }
        }

        dis.close();


    }


    public static void updateMarks(List<Course> courses, List<Student> students, String filename) throws IOException {
        FileReader fis = new FileReader(filename);
        BufferedReader dis = new BufferedReader(fis);
        String line;


        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            String courseId = tokens.nextToken();
            Course c = courses.stream().filter(e -> e.getCode().equals(courseId)).findFirst().get();

            String studentId = tokens.nextToken();
            Student st = students.stream().filter(e -> e.getCode().equals(studentId)).findFirst().get();

            c.addStudent(st);
            int score = Integer.parseInt(tokens.nextToken());

            Score s = new Score(st, score);
            c.addScore(s);

        }

        dis.close();


    }


    public static void main(String[] args) throws Exception {
        List<Professor> profs = parseProfessors("profs.csv");
        List<Student> students = parseStudents("students.csv");
        List<Course> courses = parseCourses("courses.csv");


        updateProfessors(courses, profs, "teach.csv");
        updateMarks(courses, students, "scores.csv");


    }
}
