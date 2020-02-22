package ua.kpi.lab1.model.course;

import javafx.util.Pair;
import java.util.List;

public class Subjects {
    private String nameSubject;
    private int gradeSubject;
    private boolean isExam;
    public Subjects(String nameSubject,int  gradeSubject,boolean isExam){
        this.nameSubject = nameSubject;
        this.gradeSubject = gradeSubject;
        this.isExam = isExam;
    }
}
