package ua.kpi.lab1.controller;


import javafx.util.Pair;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;
import ua.kpi.lab1.view.View;
import java.util.List;



public class UtilityController {

    List<Zalikovka> zalikovkas;

    private List<Zalikovka> createZalikovkaBase(){
        for(int count = 0; count< View.NUMBER_OF_ZALIKOVKA; count++){
            Zalikovka zalikovka = new Zalikovka(creatorIid(),
                                                creatorListOfCourses(numberOfCourses()),
                                                creatorNameStudent());
        }
        return zalikovkas;
    }

    private int numberOfCourses() {
        return 0;

    }


    private List<Course> creatorListOfCourses(int numberOfCourses) {
        List<Course> courses = (List<Course>) new Course(1,"name",creatorSubject());
        return courses;
    }

    private List<Subjects> creatorSubject() {
        List<Subjects> subjects = (List<Subjects>) new Subjects(creatorOfSubjectName(),creatorOfSubjectGrade(),creatorOfExam());
        return subjects;
    }

    private int creatorOfSubjectGrade() {
        return 0;
    }

    private String creatorOfSubjectName() {
        return null;
    }

    private boolean creatorOfExam(){
        return true;
    }


    private String creatorNameStudent() {
        return null;
    }

    private int creatorIid() {
        return 0;
    }


}
