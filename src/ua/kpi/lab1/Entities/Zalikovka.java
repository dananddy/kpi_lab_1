package ua.kpi.lab1.Entities;

import ua.kpi.lab1.Entities.Course.Course;

import java.util.List;

public class Zalikovka {

    private int numZalikovka;

    private int idStudent;

    private String NameStudent;

    private List<Course> course;

    public Zalikovka(int idStudent,List<Course> courses,String studentName, int numZalikovka){
        this.idStudent = idStudent;
        this.NameStudent = studentName;
        this.course = courses;

        this.numZalikovka = numZalikovka;
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

    public int getNumZalikovka() {
        return numZalikovka;
    }
}
