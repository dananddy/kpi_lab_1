package ua.kpi.lab1.model.course;

import javafx.util.Pair;

import java.util.List;

public class Course {

    private int courseYear;
    private String courseName;
    private List<Subjects> subject;


    public Course(int numberOfCourse, String nameOfCourse, List<Subjects> subject){
        this.courseYear = numberOfCourse;
        this.courseName = nameOfCourse;
        this.subject = subject;
    }



    public int getCourseNumber(Course course){ return course.courseYear;}
    public String getCourseName(Course course){ return course.courseName;}
    public List<Subjects> getSubject(Course course){ return course.subject;}
}
