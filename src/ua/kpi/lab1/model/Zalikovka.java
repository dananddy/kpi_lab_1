package ua.kpi.lab1.model;

import ua.kpi.lab1.model.course.Course;

import java.util.List;

public class Zalikovka {

    private int idStudent;

    private String firstNameStudent;
    private String lastNameStudent;
    private String middleNameStudent;

    List<Course> course;

    public Zalikovka(int idStudent,List<Course> courses,String ... studentName){
        this.idStudent = idStudent;
        this.lastNameStudent = studentName[0];
        this.firstNameStudent = studentName[1];
        this.middleNameStudent = studentName[2];

        this.course = courses;
    }



}
