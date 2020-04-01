package ua.kpi.lab1.Entities.Course;

import ua.kpi.lab1.Entities.Subjects;

import java.util.List;

public class Course {

    private int courseYear;
    private List<Subjects> subject;

    public Course(int numberOfCourse, List<Subjects> subject){
        this.courseYear = numberOfCourse;
        this.subject = subject;
    }

    public int getCourseNumber(){ return courseYear;}

    public List<Subjects> getSubject(){ return subject;}
}
