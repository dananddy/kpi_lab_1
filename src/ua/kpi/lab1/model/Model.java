package ua.kpi.lab1.model;

import ua.kpi.lab1.model.StudentNames.StudentFullName;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.CourseName;
import ua.kpi.lab1.model.course.Subjects;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ua.kpi.lab1.view.View.*;


public class Model {

    private Random random = new Random();
    private List<Zalikovka> zalikovkas= new ArrayList<>();;


    public void createZalikovkas(){

        createZalikovkaBase(numberOfZalikovkas());

    }

    public List<Zalikovka> getZalikovkas(){
        return zalikovkas;
    }

    public void createZalikovkaBase(int numberOfZalikovka){
        for(int count = 0; count< numberOfZalikovka; count++) {
            Zalikovka zalikovka = new Zalikovka(creatorId(),
                    creatorListOfCourses(),
                    creatorNameStudent(), count+1);
            zalikovkas.add(zalikovka);
        }
    }


    private List<Course> creatorListOfCourses() {
        List<Course> courses= new ArrayList<>();
        for (int count =1; count<=numberOfCourses(); count++){
            courses.add(new Course(count,creatorSubject()));
        }
        return courses;

    }

    private List<Subjects> creatorSubject() {
        List<Subjects> subjects = new ArrayList<>();

        int numberOfSubjects = numberOfSubjects();

        ArrayList<String> subjectList = creatorOfSubjectNames(numberOfSubjects);

        for (int count =0; count<numberOfSubjects; count++){
            subjects.add(new Subjects(subjectList.get(count),creatorOfSubjectGrade(),creatorOfExam()));
        }
        return subjects;
    }
    private ArrayList<String> creatorOfSubjectNames(int numberOfSubjects) {
        return CourseName.getRandomNameCourseAsString(numberOfSubjects);
    }

    private boolean creatorOfExam(){
        int flag = (int)Math.round(Math.random());
        return flag != 0;
    }
    private int creatorOfSubjectGrade() {
        return (int) (Math.random()*(NUMBER_MAX_GRADE - NUMBER_MIN_GRADE + 1) + NUMBER_MIN_GRADE);
    }

    private String creatorNameStudent() {
        StudentFullName studentFullName = new StudentFullName();
        return studentFullName.getNameStudentFull();
    }

    private int creatorId() {
        return (int) (Math.random()*(NUMBER_ID_MAX - NUMBER_ID_MIN + 1) + NUMBER_ID_MIN);
    }

    private int numberOfZalikovkas() {
        return (int) (Math.random()*(NUMBER_ZALIKOVKA_MAX - NUMBER_ZALIKOVKA_MIN + 1) + NUMBER_ZALIKOVKA_MIN);
    }
    private int numberOfCourses() {
        return (int) (Math.random()*(NUMBER_COURSES_MAX - NUMBER_COURSES_MIN + 1) + NUMBER_COURSES_MIN);
    }
    private int numberOfSubjects() {
        return (int) (Math.random()*(NUMBER_SUBJECT_MAX - NUMBER_SUBJECT_MIN + 1) + NUMBER_SUBJECT_MIN);
    }
}
