package ua.kpi.lab1.model;

import ua.kpi.lab1.model.course.Course;

import java.util.List;

public class Zalikovka {

    private int idStudent;

    private String NameStudent;


    List<Course> course;

    public Zalikovka(int idStudent,List<Course> courses,String studentName){
        this.idStudent = idStudent;
        this.NameStudent = studentName;


        this.course = courses;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getNameStudent() {
        return NameStudent;
    }

    public List<Course> getCourse() {
        return course;
    }
}
