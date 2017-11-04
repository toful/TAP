package course2;

import course.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by pedrotgn on 03/10/2017.
 */
public class CSVFactory implements SchoolFactory


{
    @Override
    public School createSchool(String name) {
        try {
            List<Professor> profs = parseProfessors("profs.csv");
            List<Student> students = parseStudents("students.csv");
            List<Course> courses = parseCourses("courses.csv");
            updateProfessors(courses, profs, "teach.csv");
            updateMarks(courses, students, "scores.csv");
            return new School(name,courses,profs,students);
        }catch(IOException e){
            e.printStackTrace();
        }

        return null;

    }

    @Override
    public Course createCourse(String code, String name, int year) {
        return new CourseImpl(code,name,year);
    }

    @Override
    public School createSchool() {
        return createSchool("URV");
    }


    public  List<Professor> parseProfessors(String filename) throws IOException {
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


    public  List<Student> parseStudents(String filename) throws IOException {
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

    public  List<Course> parseCourses(String filename) throws IOException {
        FileReader fis = new FileReader(filename);
        BufferedReader dis = new BufferedReader(fis);
        String line;

        List<Course> list = new LinkedList<>();


        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            Course c = createCourse(tokens.nextToken(), tokens.nextToken(), Integer.parseInt(tokens.nextToken()));
            list.add(c);

        }

        dis.close();
        return list;

    }


    public  void updateProfessors(List<Course> courses, List<Professor> profs, String filename) throws IOException {
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


    public  void updateMarks(List<Course> courses, List<Student> students, String filename) throws IOException {
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
}
