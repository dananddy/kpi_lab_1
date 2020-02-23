package ua.kpi.lab1.controller;


import javafx.util.Pair;
import ua.kpi.lab1.model.StudentNames.StudentFullName;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.CourseName;
import ua.kpi.lab1.model.course.Subjects;
import ua.kpi.lab1.view.View;

import java.util.ArrayList;
import java.util.List;

import static ua.kpi.lab1.view.View.*;


public class UtilityController {

    private List<Zalikovka> zalikovkas= new ArrayList<>();

    public void createZalikovkaBase(int numberOfZalikovka, int numberOfCourses, int numberOfSubjects){
        for(int count = 0; count< numberOfZalikovka; count++) {
            Zalikovka zalikovka = new Zalikovka(creatorId(),
                    creatorListOfCourses(numberOfCourses, numberOfSubjects),
                    creatorNameStudent());
            zalikovkas.add(zalikovka);
        }
    }
    public  List<Zalikovka> getZalikovkasList(){return zalikovkas;}

    private List<Course> creatorListOfCourses(int numberOfCourses, int numberOfSubjects) {
        List<Course> courses= new ArrayList<>();
        for (int count =1; count<=numberOfCourses; count++){
           courses.add(new Course(count,creatorSubject(numberOfSubjects)));
        }
        return courses;

    }

    private List<Subjects> creatorSubject(int numberOfSubjects) {
        List<Subjects> subjects = new ArrayList<>();
        /*ArrayList<Integer> list = new ArrayList<>(numberOfSubjects);
        for(int i = 0; i < numberOfSubjects; i++) {
            list.add(i);
        }*/
        for (int count =1; count<=numberOfSubjects; count++){
            subjects.add(new Subjects(creatorOfSubjectName(),
                    creatorOfSubjectGrade(),
                    creatorOfExam()));
        }
        return subjects;
    }

    private int creatorOfSubjectGrade() {
        return (int) (Math.random()*(NUMBER_MAX_GRADE - NUMBER_MIN + 1) + NUMBER_MIN);
    }

    private String creatorOfSubjectName() {
        return CourseName.getRandomNameCourseAsString();
    }

    private boolean creatorOfExam(){
        int flag = (int)Math.round(Math.random());
        return flag != 0;
    }


    private String creatorNameStudent() {
        StudentFullName studentFullName = new StudentFullName();
        return studentFullName.getNameStudentFull();
    }

    private int creatorId() {
        return (int) (Math.random()*(NUMBER_ID_MAX - NUMBER_ID_MIN + 1) + NUMBER_ID_MIN);
    }


}
