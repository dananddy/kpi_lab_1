package ua.kpi.lab1.model.course;

import javafx.util.Pair;

public class Course {

    private int courseYear;
    private String courseName;
    private Subjects subject;


    public Course(int numberOfCourse, String nameOfCourse, Subjects subject){
        this.courseYear = numberOfCourse;
        this.courseName = nameOfCourse;
        this.subject = subject;
    }



    public int getCourseNumber(Course course){ return course.courseYear;}
    public String getCourseName(Course course){ return course.courseName;}
    public Subjects getSubject(Course course){ return course.subject;}
}
