package ua.kpi.lab1.view;

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
    public void outStudentGoodGradeShow(List<String> students) {
        try {
            for (String student: students){
                System.out.println (student+'\n');

            }

        }catch (NullPointerException e){
            System.out.println("none");
        }

    }



}
