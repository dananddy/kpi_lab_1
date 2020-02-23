package ua.kpi.lab1.controller;

import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;
import ua.kpi.lab1.view.View;

import java.util.List;

import static ua.kpi.lab1.view.View.*;

public class OutputData {
    UtilityController utilityController = new UtilityController();
    View view;

    public OutputData(View view){
        this.view = view;
    }

    public void outData(){
        List<Zalikovka> zalikovkas;

        utilityController.createZalikovkaBase(View.NUMBER_OF_ZALIKOVKA,View.NUMBER_OF_COURSES, numberOfSubjects());
        zalikovkas = utilityController.getZalikovkasList();

        view.printAllZalikovkas();
        for (Zalikovka zalikovka: zalikovkas){
            System.out.println (zalikovka.getIdStudent()+"\t\t"+
                                zalikovka.getNameStudent());
            zalikovkaCourseShow(zalikovka.getCourse());
            view.printMessage(TABLE_SIGN);
        }
    }

    private void zalikovkaCourseShow(List<Course> courses) {
        for (Course course: courses){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+course.getCourseNumber()+"\t\t\t");
            zalikovkaSubjectShow(course.getSubject());
        }
    }

    private void zalikovkaSubjectShow(List<Subjects> subjects) {
        for (Subjects subject: subjects){
            System.out.println ("\t\t\t\t\t\t\t\t\t\t\t\t\t"+subject.getNameSubject()+"\t\t"+subject.getGradeSubject());

        }
    }

    private int numberOfSubjects() {
        return (int) (Math.random()*(NUMBER_SUBJECT_MAX - NUMBER_SUBJECT_MIN + 1) + NUMBER_SUBJECT_MIN);
    }
}
