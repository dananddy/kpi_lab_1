package ua.kpi.lab1.Entities;

public class Subjects {

    private String nameSubject;
    private int gradeSubject;
    private boolean isExam;

    public Subjects(String nameSubject,int  gradeSubject,boolean isExam){
        this.nameSubject = nameSubject;
        this.gradeSubject = gradeSubject;
        this.isExam = isExam;
    }

    public String getNameSubject() {return nameSubject;}
    public int getGradeSubject() {
        return gradeSubject;
    }
    public boolean getExamSubject(){return isExam;}
}
