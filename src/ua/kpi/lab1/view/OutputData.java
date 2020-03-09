package ua.kpi.lab1.view;

import javafx.util.Pair;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;
import ua.kpi.lab1.view.View;

import java.util.List;

import static ua.kpi.lab1.view.View.*;

public class OutputData {

    View view;
    Model model;

    public OutputData(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void outZalikovka(List<Zalikovka> zalikovkas){

        zalikovkaZalikovkaShow(zalikovkas);

    }
    public void zalikovkaZalikovkaShow(List<Zalikovka> zalikovkas) {
        view.printAllZalikovkas();
        view.printMessage(TABLE_SIGN);
        for (Zalikovka zalikovka: zalikovkas){
            System.out.format ("%-3s|%-8s|%-30s|\n",zalikovka.getNumZalikovka(),zalikovka.getIdStudent(),
                    zalikovka.getNameStudent());
            zalikovkaCourseShow(zalikovka.getCourse());
            view.printMessage(TABLE_SIGN);
        }
    }

    private void zalikovkaCourseShow(List<Course> courses) {
        for (Course course: courses){
            System.out.format("%3s|%8s|%30s: \n","","",course.getCourseNumber());
            zalikovkaSubjectShow(course.getSubject());
        }
    }

    private void zalikovkaSubjectShow(List<Subjects> subjects) {
        for (Subjects subject: subjects){
            System.out.format ("%3s|%8s|%30s|%-20s (%4s) - %3d\n","","","",subject.getNameSubject(),getExamOfSubject(subject),subject.getGradeSubject());

        }
    }

    private String getExamOfSubject(Subjects subject) {
        return (subject.getExamSubject()) ? "Exam" : "Test";
    }

    public void outStudentGoodGradeShow(List<Pair> students) {
        for (Pair student: students){ System.out.format ("%-30s  %.1f\n",student.getKey(),student.getValue());}
    }

    public void outSubjectsIsExamShow(List<String> subjects) {

        for (String subject: subjects){
            System.out.println (subject);

        }
    }


}
